package dad.javafx.calculadora;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculadoraApp extends Application {
	
	private CalculadoraController calculadoraController;

	@Override
	public void start(Stage primaryStage) throws Exception {
		calculadoraController = new CalculadoraController();

		Scene scene = new Scene(calculadoraController.getView());
		primaryStage.setScene(scene);
		primaryStage.setTitle("CalculadoraFXML");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	

}
