package co.edu.uniquindio.proyectofacade.ViewControllers;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class VistaControlador {

    @FXML
    private Button BtnCargarArchivo;

    @FXML
    private Button BtnReproducir;

    @FXML
    private TextField BuscarArchivoTxt;

    @FXML
    private TableView<String> ListVideos;

    @FXML
    private TableColumn<String, String> colmNombre;

    @FXML
    private Label lblreproduciendo;

    private ObservableList<String> listaVideos = FXCollections.observableArrayList(); // Lista de archivos

    @FXML
    void initialize() {
        lblreproduciendo.setText("Esperando reproducción...");

        // Configurar la columna de la tabla
        colmNombre.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue()));

        // Configurar la tabla para usar la lista
        ListVideos.setItems(listaVideos);
    }

    @FXML
    void onActioncargarArchivo(ActionEvent event) {
        String nombreArchivo = BuscarArchivoTxt.getText().trim();

        if (!nombreArchivo.isEmpty()) {
            listaVideos.add(nombreArchivo); // Agregar a la lista
            BuscarArchivoTxt.clear(); // Limpiar el campo de texto
        }
    }

    @FXML
    void onActionReproducir(ActionEvent actionEvent) {
        String videoSeleccionado = ListVideos.getSelectionModel().getSelectedItem();

        if (videoSeleccionado != null) {
            lblreproduciendo.setText("Reproduciendo: " + videoSeleccionado);
            System.out.println("Reproduciendo: " + videoSeleccionado); // Verificar en la consola
        } else {
            lblreproduciendo.setText("Seleccione un video para reproducir.");
            System.out.println("No se ha seleccionado ningún video.");
        }
    }
}
