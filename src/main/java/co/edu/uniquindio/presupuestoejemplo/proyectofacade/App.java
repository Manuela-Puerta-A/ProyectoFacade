package co.edu.uniquindio.presupuestoejemplo.proyectofacade;

import co.edu.uniquindio.presupuestoejemplo.proyectofacade.videoCo.VideoFacade;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class App extends Application {
	@Override
	public void start(Stage stage) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("vista.fxml"));
		Scene scene = new Scene(fxmlLoader.load());
		stage.setTitle("Reproductor");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch();

	}



}
