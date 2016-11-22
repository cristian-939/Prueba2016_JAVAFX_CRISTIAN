package application.control;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
/**
 * establece un constructor y lo guarda Inicializa con start y
 * recibe la informacion de Stage
 * 
 * @author Cristian
 * 
 */
public class MainFX extends Application {
	private Stage primaryStage;
	private AnchorPane rootLayout;

	public static void main(String[] args) {
		launch(args);
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("My GitHub Profile");
		initRootLayout();

	}

	/**
	 * Inicia la vista en la cual mete valores y se establece
	 *         una conexion con el css
	 *         
	 */
	private void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFX.class.getResource("../vista/Profile.fxml"));
			rootLayout = (AnchorPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);
			// ------------------------------------BLOQUE DE LINCAMIENTO
			// CSS--------------

			// ponerle fuentes
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// enlazo con el css
			Font.loadFont(getClass().getResourceAsStream("../vista/assets/fonts/HipsterishFontNormal.ttf"), 20);

			// ------------------------------------BLOQUE DE LINCAMIENTO
			// GOOGLE--------------
			// scene.getStylesheets().add("http://fonts.googleapis.com/css?family=Shadows+Into+Light");
			// scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Bungee+Inline");

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
