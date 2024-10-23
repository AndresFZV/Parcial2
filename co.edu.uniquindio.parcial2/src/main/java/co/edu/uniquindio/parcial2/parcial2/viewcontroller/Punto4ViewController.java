package co.edu.uniquindio.parcial2.parcial2.viewcontroller;

import co.edu.uniquindio.parcial2.parcial2.model.Prestamo;
import co.edu.uniquindio.parcial2.parcial2.utils.DataUtil;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.stream.Collectors;

public class Punto4ViewController {

    @FXML
    private Button buscarFecha;

    @FXML
    private TableView<Prestamo> tablaFechas;

    @FXML
    private TableColumn<Prestamo, String> tcNumeroPrestamo;

    @FXML
    private TableColumn<Prestamo, String> tcDescripcion;

    @FXML
    private TableColumn<Prestamo, LocalDate> tcFechaPrestamo;

    @FXML
    private TableColumn<Prestamo, String> tcCliente;

    @FXML
    private TableColumn<Prestamo, String> tcEmpleado;

    @FXML
    private TableColumn<Prestamo, String> tcObjeto;

    @FXML
    private TextField txtRangoFechas;

    private ObservableList<Prestamo> prestamos = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        initView();
        cargarDatosIniciales();

        buscarFecha.setOnAction(event -> buscarPorFecha());
    }

    private void initView() {
        initDataBinding();
    }

    private void initDataBinding() {
        tcNumeroPrestamo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNumeroPrestamo()));
        tcDescripcion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDescripcion()));
        tcFechaPrestamo.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getFechaPrestamo())); // Directamente LocalDate
        tcCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getClienteAsociado().getNombre()));
        tcEmpleado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEmpleadoAsociado().getNombre()));
        tcObjeto.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getListaObjetosAsociados().get(0).getNombre()));
    }

    private void cargarDatosIniciales() {
        prestamos.addAll(DataUtil.inicializarDatos().getListaPrestamos());
        tablaFechas.setItems(prestamos);
    }

    private void buscarPorFecha() {
        String input = txtRangoFechas.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            List<Prestamo> prestamosFiltrados;
            if (input.contains(" - ")) {
                String[] fechas = input.split(" - ");
                LocalDate fechaInicio = LocalDate.parse(fechas[0].trim(), formatter);
                LocalDate fechaFin = LocalDate.parse(fechas[1].trim(), formatter);
                prestamosFiltrados = prestamos.stream()
                        .filter(prestamo -> {
                            LocalDate fechaPrestamo = prestamo.getFechaPrestamo();
                            return fechaPrestamo != null &&
                                    (fechaPrestamo.isEqual(fechaInicio) || fechaPrestamo.isEqual(fechaFin) ||
                                            (fechaPrestamo.isAfter(fechaInicio) && fechaPrestamo.isBefore(fechaFin)));
                        })
                        .collect(Collectors.toList());

            } else {
                LocalDate fecha = LocalDate.parse(input.trim(), formatter);
                prestamosFiltrados = prestamos.stream()
                        .filter(prestamo -> {
                            LocalDate fechaPrestamo = prestamo.getFechaPrestamo();
                            return fechaPrestamo != null && fechaPrestamo.isBefore(fecha);
                        })
                        .collect(Collectors.toList());
            }

            tablaFechas.setItems(FXCollections.observableArrayList(prestamosFiltrados));
        } catch (DateTimeParseException e) {
            mostrarError("Formato de fecha inválido. Usa el formato 'yyyy-MM-dd' o un rango 'yyyy-MM-dd - yyyy-MM-dd'.");
        }
    }


    private void mostrarError(String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("Error");
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
