package co.edu.uniquindio.presupuestoejemplo.proyectofacade.ViewControllers;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;


    public class VistaControlador extends Application {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button BtnReproducir;

        @FXML
        private Label lblReproduciendo;

        @FXML
        private Label lblArchivo;

        @FXML
        private TextArea txtAreamostrarRepro;

        @FXML
        private TextField BuscarArchivoTxt;

        @FXML
        private Button BtnCargarArchivo;

        @FXML
        private Label lbltitulo;

        @FXML
        void onActioncargarArchivo(ActionEvent event) {

        }

        @FXML
        void onActionReproducir(ActionEvent event) {

        }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
