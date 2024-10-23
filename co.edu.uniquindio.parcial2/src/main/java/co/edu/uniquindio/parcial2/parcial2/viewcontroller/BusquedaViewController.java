package co.edu.uniquindio.parcial2.parcial2.viewcontroller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import co.edu.uniquindio.parcial2.parcial2.model.Cliente;
import co.edu.uniquindio.parcial2.parcial2.model.Objeto;
import co.edu.uniquindio.parcial2.parcial2.model.Prestamo;
import co.edu.uniquindio.parcial2.parcial2.utils.DataUtil;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class BusquedaViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnBuscar;

    @FXML
    private Button btnConsultar;

    @FXML
    private TableView<Cliente> tablaClientes; // Tabla para mostrar los clientes

    @FXML
    private TableColumn<Cliente, String> tcCedula;

    @FXML
    private TableColumn<Cliente, String> tcNombre;

    @FXML
    private TableView<Objeto> tablaPrestamos;

    @FXML
    private TableColumn<Objeto, String> tcNombreObjeto;

    @FXML
    private TableColumn<Objeto, String> tcIdProducto;

    @FXML
    private TextField txtBuscar;

    @FXML
    private TextField txtRango; // Campo para ingresar el número de préstamos

    private List<Cliente> listaClientes;
    private List<Prestamo> listaPrestamos; // Lista de préstamos para contar los préstamos por cliente

    // Lista observable para la tabla de clientes
    private ObservableList<Cliente> clientesObservable;

    @FXML
    void onBuscarCliente(ActionEvent event) {
        buscarCliente();
    }



    private void buscarCliente() {
        String cedula = txtBuscar.getText().trim();
        if (cedula.isEmpty()) {
            mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "Por favor, ingrese una cédula válida.");
            return;
        }
        List<Cliente> clientesEncontrados = listaClientes.stream()
                .filter(cliente -> cliente.getCedula().trim().equals(cedula))
                .collect(Collectors.toList());
        if (clientesEncontrados.isEmpty()) {
            mostrarAlerta(Alert.AlertType.ERROR, "Error", "Cliente no encontrado.");
            tablaClientes.setItems(FXCollections.observableArrayList());
        } else {
            actualizarTablaClientes(clientesEncontrados);
            mostrarAlerta(Alert.AlertType.INFORMATION, "Éxito", "Cliente(s) encontrado(s).");
        }
    }

    private int contarPrestamosPorCliente(Cliente cliente) {
        return (int) listaPrestamos.stream()
                .filter(prestamo -> prestamo.getClienteAsociado().equals(cliente))
                .count();
    }

    @FXML
    void initialize() {
        listaClientes = DataUtil.inicializarDatos().getListaClientes();
        clientesObservable = FXCollections.observableArrayList();

        initView();
    }

    private void initView() {
        initDataBinding();
    }

    private void initDataBinding() {
        tcCedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCedula()));
        tcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tablaClientes.setItems(clientesObservable);
    }

    private void actualizarTablaClientes(List<Cliente> clientes) {
        clientesObservable.clear();
        clientesObservable.addAll(clientes);
    }

    public void mostrarAlerta(Alert.AlertType tipo, String title, String content) {
        Alert alert = new Alert(tipo);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
