package co.edu.uniquindio.parcial2.parcial2.viewcontroller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import co.edu.uniquindio.parcial2.parcial2.model.Cliente;
import co.edu.uniquindio.parcial2.parcial2.model.Objeto;
import co.edu.uniquindio.parcial2.parcial2.model.PrestamoObjeto;
import co.edu.uniquindio.parcial2.parcial2.utils.DataUtil;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Busqueda2ViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnConsultarClientes;

    @FXML
    private Button btnMostrarPrestados;

    @FXML
    private Button btnMostrarNoPrestados;

    @FXML
    private Button btnMostrarTodos;

    @FXML
    private TableView<Cliente> tablaClientes;

    @FXML
    private TableColumn<Cliente, String> tcNombreCliente;

    @FXML
    private TableColumn<Cliente, Integer> tcNumerosPrestamos;

    @FXML
    private TableView<Objeto> tablaObjetos;

    @FXML
    private TableColumn<Objeto, String> tcNombreObjeto;

    @FXML
    private TableColumn<Objeto, String> tcEstadoObjeto;

    @FXML
    private TextField txtRango;

    private PrestamoObjeto prestamoObjeto;
    private List<Cliente> listaClientes;
    private List<Objeto> listaObjetos;

    @FXML
    void onConsultarClientes(ActionEvent event) {
        consultarClientesPorRango();
    }

    @FXML
    void onMostrarPrestados(ActionEvent event) {
        mostrarObjetosConPrestamo();
    }

    @FXML
    void onMostrarNoPrestados(ActionEvent event) {
        mostrarObjetosSinPrestamo();
    }

    @FXML
    void onMostrarTodos(ActionEvent event) {
        mostrarTodosObjetos();
    }

    private void consultarClientesPorRango() {
        String rangoTexto = txtRango.getText().trim();
        if (rangoTexto.isEmpty()) {
            mostrarAlerta(Alert.AlertType.ERROR, "Error", "Por favor, ingrese un rango.");
            return;
        }
        try {
            int rango = Integer.parseInt(rangoTexto);
            List<Cliente> clientesFiltrados = filtrarClientesPorPrestamos(rango);
            tablaClientes.getItems().setAll(clientesFiltrados);
        } catch (NumberFormatException e) {
            mostrarAlerta(Alert.AlertType.ERROR, "Error", "Ingrese un número válido.");
        }
    }

    private List<Cliente> filtrarClientesPorPrestamos(int rango) {
        return listaClientes.stream()
                .filter(cliente -> filtrarPrestamosPorCliente(cliente) == rango)
                .collect(Collectors.toList());
    }

    private long filtrarPrestamosPorCliente(Cliente cliente) {
        return prestamoObjeto.getListaPrestamos().stream()
                .filter(prestamo -> prestamo.getClienteAsociado().equals(cliente))
                .count();
    }

    private void mostrarObjetosConPrestamo() {
        List<Objeto> objetosFiltrados = listaObjetos.stream()
                .filter(objeto -> "prestado".equalsIgnoreCase(objeto.getEstado()))
                .collect(Collectors.toList());
        if (objetosFiltrados.isEmpty()) {
            mostrarAlerta(Alert.AlertType.INFORMATION, "Información", "No hay objetos prestados.");
        } else {
            tablaObjetos.getItems().setAll(objetosFiltrados);
        }
    }

    private void mostrarObjetosSinPrestamo() {
        List<Objeto> objetosFiltrados = listaObjetos.stream()
                .filter(objeto -> "disponible".equalsIgnoreCase(objeto.getEstado()))
                .collect(Collectors.toList());
        if (objetosFiltrados.isEmpty()) {
            mostrarAlerta(Alert.AlertType.INFORMATION, "Información", "No hay objetos disponibles.");
        } else {
            tablaObjetos.getItems().setAll(objetosFiltrados);
        }
    }

    private void mostrarTodosObjetos() {
        tablaObjetos.getItems().setAll(listaObjetos);
    }

    @FXML
    void initialize() {
        initView();
        prestamoObjeto = DataUtil.inicializarDatos();
        cargarDatosIniciales();
        btnConsultarClientes.setOnAction(this::onConsultarClientes);
        btnMostrarPrestados.setOnAction(this::onMostrarPrestados);
        btnMostrarTodos.setOnAction(this::onMostrarTodos);
        btnMostrarNoPrestados.setOnAction(this::onMostrarNoPrestados);
    }

    private void initView() {
        initDataBinding();
    }

    private void cargarDatosIniciales() {
        listaClientes = prestamoObjeto.getListaClientes();
        tablaClientes.getItems().setAll(listaClientes);

        listaObjetos = prestamoObjeto.getListaObjetos();
        tablaObjetos.getItems().setAll(listaObjetos);
    }

    private void initDataBinding() {
        tcNombreCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tcNumerosPrestamos.setCellValueFactory(cellData -> {
            Cliente cliente = cellData.getValue();
            int numeroPrestamos = (int) filtrarPrestamosPorCliente(cliente);
            return new SimpleIntegerProperty(numeroPrestamos).asObject();
        });

        tcNombreObjeto.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tcEstadoObjeto.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEstado()));
    }

    public void mostrarAlerta(Alert.AlertType tipo, String titulo, String contenido) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(contenido);
        alert.showAndWait();
    }
}