package co.edu.uniquindio.parcial2.parcial2.viewcontroller;

import co.edu.uniquindio.parcial2.parcial2.model.Empleado;
import co.edu.uniquindio.parcial2.parcial2.model.PrestamoObjeto;
import co.edu.uniquindio.parcial2.parcial2.utils.DataUtil;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Punto3ViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnBuscar;

    @FXML
    private TableView<Empleado> tablaEmpleados;

    @FXML
    private TableColumn<Empleado, String> tcApellido;

    @FXML
    private TableColumn<Empleado, String> tcCedula;

    @FXML
    private TableColumn<Empleado, Integer> tcEdad;

    @FXML
    private TableColumn<Empleado, String> tcNombre;

    @FXML
    private TextField txtRango;
    private ObservableList<Empleado> listaEmpleados = FXCollections.observableArrayList();
    private PrestamoObjeto prestamoObjeto = DataUtil.inicializarDatos();

    @FXML
    void initialize() {
        initView();
        btnBuscar.setOnAction(e -> buscarEmpleadosPorPrestamos());
    }

    private void initView() {
        initDataBinding();
        tablaEmpleados.setItems(listaEmpleados);
    }

    private void initDataBinding() {
        tcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tcApellido.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellido()));
        tcCedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCedula()));
        tcEdad.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getEdad()));

    }

    private void buscarEmpleadosPorPrestamos() {
        String rangoTexto = txtRango.getText();

        try {
            int rango = Integer.parseInt(rangoTexto);
            listaEmpleados.clear();
            for (Empleado empleado : prestamoObjeto.getListaEmpleados()) {
                long cantidadPrestamos = prestamoObjeto.getListaPrestamos().stream()
                        .filter(prestamo -> prestamo.getEmpleadoAsociado().equals(empleado))
                        .count();
                if (cantidadPrestamos == rango) {
                    listaEmpleados.add(empleado);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor ingrese un número válido.");
        }
    }
}
