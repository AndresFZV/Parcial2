package co.edu.uniquindio.parcial2.parcial2.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import co.edu.uniquindio.parcial2.parcial2.model.Cliente;
import co.edu.uniquindio.parcial2.parcial2.model.Objeto;
import co.edu.uniquindio.parcial2.parcial2.model.PrestamoObjeto;
import co.edu.uniquindio.parcial2.parcial2.utils.DataUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Busqueda2ViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnConsultarClientes;

    @FXML
    private TableView<Cliente> tablaClientes;

    @FXML
    private TableColumn<Cliente, String> tcNombreCliente;

    @FXML
    private TableColumn<Cliente, Integer> tcNumerosPrestamos;

    @FXML
    private TableView<Objeto> tablaObjetos; // Tabla para objetos

    @FXML
    private TableColumn<Objeto, String> tcNombreObjeto; // Columna nombre objeto

    @FXML
    private TableColumn<Objeto, String> tcEstadoObjeto; // Columna estado objeto

    @FXML
    private TextField txtRango;

    private ObservableList<Cliente> clientes;
    private ObservableList<Objeto> objetos; // Lista de objetos

    private PrestamoObjeto prestamoObjeto;

    @FXML
    void initialize() {
        initView();
        prestamoObjeto = DataUtil.inicializarDatos();
        cargarDatosIniciales();
        cargarObjetos();
    }

    private void initView() {
        tcNombreCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tcNumerosPrestamos.setCellValueFactory(cellData -> {
            Cliente cliente = cellData.getValue();
            int numeroPrestamos = (int) filtrarPrestamosPorCliente(cliente);
            return new SimpleIntegerProperty(numeroPrestamos).asObject();
        });
        tcNombreObjeto.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tcEstadoObjeto.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEstado()));
    }

    private void cargarDatosIniciales() {
        clientes = FXCollections.observableArrayList(prestamoObjeto.getListaClientes());
        tablaClientes.setItems(clientes);
    }

    private void cargarObjetos() {
        objetos = FXCollections.observableArrayList(prestamoObjeto.getListaObjetos());
        tablaObjetos.setItems(objetos);
    }

    @FXML
    void onConsultarClientes(ActionEvent event) {
        consultarClientesPorRango();
    }

    private void consultarClientesPorRango() {
        String rangoTexto = txtRango.getText().trim();
        if (rangoTexto.isEmpty()) {
            mostrarAlerta(Alert.AlertType.ERROR, "Error", "Por favor, ingrese un rango.");
            return;
        }
        try {
            int rango = Integer.parseInt(rangoTexto);
            ObservableList<Cliente> clientesFiltrados = filtrarClientesPorPrestamos(rango);
            tablaClientes.setItems(clientesFiltrados);
        } catch (NumberFormatException e) {
            mostrarAlerta(Alert.AlertType.ERROR, "Error", "Ingrese un número válido.");
        }
    }

    private ObservableList<Cliente> filtrarClientesPorPrestamos(int rango) {
        return FXCollections.observableArrayList(
                clientes.stream()
                        .filter(cliente -> filtrarPrestamosPorCliente(cliente) > rango)
                        .collect(Collectors.toList())
        );
    }

    private long filtrarPrestamosPorCliente(Cliente cliente) {
        return prestamoObjeto.getListaPrestamos().stream()
                .filter(prestamo -> prestamo.getClienteAsociado().equals(cliente))
                .count();
    }

    private void mostrarAlerta(Alert.AlertType tipo, String title, String content) {
        Alert alert = new Alert(tipo);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}