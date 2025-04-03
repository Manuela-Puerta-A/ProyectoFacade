package co.edu.uniquindio.proyectofacade.ViewControllers;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;

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
    private Label lblMensajeError; // Agrega un Label en tu FXML para mostrar mensajes

    @FXML
    void onActioncargarArchivo(ActionEvent event) {
        String nombreArchivo = BuscarArchivoTxt.getText().trim();

        if (!nombreArchivo.isEmpty()) {
            if (nombreArchivo.toLowerCase().endsWith(".mp4")) {
                listaVideos.add(nombreArchivo);
                BuscarArchivoTxt.clear();
                lblMensajeError.setText("");
                mostrarAlerta("Éxito", "Archivo cargado correctamente", "El archivo '" + nombreArchivo + "' ha sido agregado.");
            } else {
                lblMensajeError.setText(" Solo se permiten archivos .mp4");
            }
        } else {
            lblMensajeError.setText(" Ingresa un nombre de archivo");
        }
    }
    private void mostrarAlerta(String titulo, String encabezado, String contenido) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(encabezado);
        alert.setContentText(contenido);
        alert.showAndWait();}

    @FXML
    void onActionReproducir(ActionEvent actionEvent) {
        String videoSeleccionado = ListVideos.getSelectionModel().getSelectedItem();

        if (videoSeleccionado != null) {
            lblreproduciendo.setText("Reproduciendo: " + videoSeleccionado);
            System.out.println("Reproduciendo: " + videoSeleccionado); // Verificar en la consola
            mostrarAlerta("Reproducción", "Reproduciendo video", "El video '" + videoSeleccionado + "' se está reproduciendo.");
        } else {
            lblreproduciendo.setText("Seleccione un video para reproducir.");
            System.out.println("No se ha seleccionado ningún video.");
        }
    }
}
