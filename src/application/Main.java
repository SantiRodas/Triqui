/*
 * SANTIAGO RODAS RODRIGUEZ
 * PROYECTO PERSONAL
 * JUEGO TRIQUI
 */

package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	
	// ----------------------------------------------------------------------------
	
	private Controladora controladora;
	
	// ----------------------------------------------------------------------------
	
	public Main() {
		
		controladora = new Controladora();
		
	}
	
	// ----------------------------------------------------------------------------
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("pantalla1.fxml"));

			fxmlLoader.setController(controladora);
			
			Parent root = fxmlLoader.load();
			
			Scene scene = new Scene(root);
			
			primaryStage.setScene(scene);
			
			primaryStage.setTitle("Triqui");
			
			primaryStage.show();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	// ----------------------------------------------------------------------------
	
	public static void main(String[] args) {
		
		launch(args);
		
	}
	
	// ----------------------------------------------------------------------------
	
}
