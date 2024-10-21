package co.edu.uniquindio.parcial2.parcial2.viewcontroller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import co.edu.uniquindio.parcial2.parcial2.model.Objeto;
import co.edu.uniquindio.parcial2.parcial2.utils.DataUtil;
import javafx.beans.property.SimpleStringProperty;
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
    private TableView<Objeto> tablaPrestamos;

    @FXML
    private TableColumn<Objeto, String> tcNombre;

    @FXML
    private TableColumn<Objeto, String> tcIdProducto;

    @FXML
    private TextField txtBuscar;

    @FXML
    private TextField txtRango;

    private List<Objeto> listaObjetos = DataUtil.inicializarDatos().getListaPrestamos()
            .stream()
            .flatMap(prestamo -> prestamo.getListaObjetosAsociados().stream()) // Extraer los objetos asociados a los préstamos
            .collect(Collectors.toList());

    @FXML
    void onBuscarObjeto(ActionEvent event) {
        buscarObjeto();
    }

    @FXML
    void onConsultarRango(ActionEvent event) {
        consultarRango();
    }

    private void buscarObjeto() {
        String id = txtBuscar.getText().trim();
        List<Objeto> objetosEncontrados = new ArrayList<>();
        for (Objeto objeto : listaObjetos) {
            if (objeto.getIdObjeto().equalsIgnoreCase(id)) {
                objetosEncontrados.add(objeto);
            }
        }
        if (objetosEncontrados.isEmpty()) {
            mostrarAlerta(Alert.AlertType.ERROR, "Error", "Producto no encontrado.");
        } else {
            StringBuilder mensaje = new StringBuilder("Productos encontrados:\n\n");
            for (Objeto objeto : objetosEncontrados) {
                mensaje.append("===================================\n");
                mensaje.append("ID del Producto: ").append(objeto.getIdObjeto()).append("\n");
                mensaje.append("Nombre: ").append(objeto.getNombre()).append("\n");
                mensaje.append("Veces Prestado: ").append(objeto.getVecesPrestado()).append("\n");
            }
            mostrarAlerta(Alert.AlertType.INFORMATION, "Éxito", mensaje.toString());
        }
    }

    private void consultarRango() {
        try {
            int rango = Integer.parseInt(txtRango.getText().trim());
            List<Objeto> objetosFiltrados = new ArrayList<>();
            for (Objeto objeto : listaObjetos) {
                if (objeto.getVecesPrestado() > rango) {
                    objetosFiltrados.add(objeto);
                }
            }
            tablaPrestamos.getItems().setAll(objetosFiltrados);
        } catch (NumberFormatException e) {
            mostrarAlerta(Alert.AlertType.ERROR, "Error", "Por favor, ingrese un número válido.");
        }
    }

    @FXML
    void initialize() {
        initView();
        btnConsultar.setOnAction(this::onConsultarRango);
        btnBuscar.setOnAction(this::onBuscarObjeto);
    }

    private void initView() {
        initDataBinding();
    }

    private void initDataBinding() {
        tcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tcIdProducto.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdObjeto()));
    }

    public void mostrarAlerta(Alert.AlertType tipo, String title, String content) {
        Alert alert = new Alert(tipo);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
