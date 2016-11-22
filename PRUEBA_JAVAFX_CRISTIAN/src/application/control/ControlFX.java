package application.control;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 * @author Cristian
 * 
 */
public class ControlFX {

	// not using yet
	@FXML
	private ImageView imageRaw;

	// Reference to the main application
	private MainFX mainApp;

	/**
	 * Es llamado por el main la aplicacion para poder traer referencias a ella
	 * misma
	 * 
	 * @param mainApp
	 *            que recibe datos de Main
	 * @version 1.0
	 */
	public void setMainApp(MainFX mainApp) {
		this.mainApp = mainApp;
	}

	/**
	 * Este metodo lo que hace es enseñar la Send.fxml
	 */
	public void sendStage() {
		try {
			// Load the fxml file and create a new stage for the popup.
			FXMLLoader loader = new FXMLLoader();
			// loader.setLocation(Main.class.getResource("view/Paginafoto.fxml"));
			loader.setLocation(MainFX.class.getResource("../vista/Send.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			Stage sendStage = new Stage();
			sendStage.setTitle("Pagina Formulario");
			Scene scene = new Scene(page);
			sendStage.setScene(scene);

			sendStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Este metodo anda Send.fxml para verla
	 * @see sendStage
	 */
	@FXML
	private void handleSend() {
		sendStage();
	}

	/**
	 * Este metodo cierra la aplicaccion
	 */
	@FXML
	private void closeStage() {
		System.exit(0);
	}

}
