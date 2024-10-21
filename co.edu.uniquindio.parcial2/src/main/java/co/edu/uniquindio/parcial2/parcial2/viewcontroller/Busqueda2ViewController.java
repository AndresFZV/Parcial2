package co.edu.uniquindio.parcial2.parcial2.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Busqueda2ViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnConsultarClientes;

    @FXML
    private TableView<?> tablaClientes;

    @FXML
    private TableView<?> tablaObjetos;

    @FXML
    private TableColumn<?, ?> tcEstadoObjeto;

    @FXML
    private TableColumn<?, ?> tcNombreCliente;

    @FXML
    private TableColumn<?, ?> tcNombreObjeto;

    @FXML
    private TableColumn<?, ?> tcNumerosPrestamos;

    @FXML
    private TextField txtRango;

    @FXML
    void onConsultarClientes(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnConsultarClientes != null : "fx:id=\"btnConsultarClientes\" was not injected: check your FXML file 'Busqueda2.fxml'.";
        assert tablaClientes != null : "fx:id=\"tablaClientes\" was not injected: check your FXML file 'Busqueda2.fxml'.";
        assert tablaObjetos != null : "fx:id=\"tablaObjetos\" was not injected: check your FXML file 'Busqueda2.fxml'.";
        assert tcEstadoObjeto != null : "fx:id=\"tcEstadoObjeto\" was not injected: check your FXML file 'Busqueda2.fxml'.";
        assert tcNombreCliente != null : "fx:id=\"tcNombreCliente\" was not injected: check your FXML file 'Busqueda2.fxml'.";
        assert tcNombreObjeto != null : "fx:id=\"tcNombreObjeto\" was not injected: check your FXML file 'Busqueda2.fxml'.";
        assert tcNumerosPrestamos != null : "fx:id=\"tcNumerosPrestamos\" was not injected: check your FXML file 'Busqueda2.fxml'.";
        assert txtRango != null : "fx:id=\"txtRango\" was not injected: check your FXML file 'Busqueda2.fxml'.";

    }

}
