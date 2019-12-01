package dad.javafx.calculadora;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;

public class CalculadoraController implements Initializable{
	
    @FXML
    private GridPane view;
    
	@FXML
    private TextArea resultadoText;

    @FXML
    private Button sieteButton;

    @FXML
    private Button cuatroButton;

    @FXML
    private Button unoButton;

    @FXML
    private Button ceroButton;

    @FXML
    private Button ochoButton;

    @FXML
    private Button cincoButton;

    @FXML
    private Button dosButton;

    @FXML
    private Button nueveButton;

    @FXML
    private Button seisButton;

    @FXML
    private Button tresButton;

    @FXML
    private Button puntoButton;

    @FXML
    private Button borrarTodoButton;

    @FXML
    private Button multiplicacionButton;

    @FXML
    private Button restaButton;

    @FXML
    private Button sumaButton;

    @FXML
    private Button borrarButton;

    @FXML
    private Button divisionButton;

    @FXML
    private Button igualButton;

    
    Calculadora calculadora = new Calculadora();
	
	public CalculadoraController() throws IOException {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalculadoraView.fxml"));
			loader.setController(this);
			loader.load();	
	}
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		resultadoText.textProperty().bind(calculadora.pantallaProperty());
	}
	
	public GridPane getView() {
		return view;
	}
    
    @FXML
    void onBorrarAction(ActionEvent event) {
    	calculadora.borrar();
    }

    @FXML
    void onBorrarTodoAction(ActionEvent event) {
    	calculadora.borrarTodo();
    }

    @FXML
    void onCeroAction(ActionEvent event) {
    	calculadora.insertar('0');
    }

    @FXML
    void onCincoAction(ActionEvent event) {
    	calculadora.insertar('5');
    }

    @FXML
    void onCuatroAction(ActionEvent event) {
    	calculadora.insertar('4');
    }

    @FXML
    void onDividirAction(ActionEvent event) {
    	calculadora.operar(Calculadora.DIVIDIR);
    }

    @FXML
    void onDosAction(ActionEvent event) {
    	calculadora.insertar('2');
    }

    @FXML
    void onIgualAction(ActionEvent event) {
    	calculadora.operar(Calculadora.IGUAL);
    }

    @FXML
    void onMultiplicarAction(ActionEvent event) {
    	calculadora.operar(Calculadora.MULTIPLICAR);
    }

    @FXML
    void onNueveAction(ActionEvent event) {
    	calculadora.insertar('9');
    }

    @FXML
    void onOchoAction(ActionEvent event) {
    	calculadora.insertar('8');
    }

    @FXML
    void onPuntoAction(ActionEvent event) {
    	calculadora.insertarComa();

    }

    @FXML
    void onRestarAction(ActionEvent event) {
    	calculadora.operar(Calculadora.RESTAR);
    }

    @FXML
    void onSesisAction(ActionEvent event) {
    	calculadora.insertar('6');
    }

    @FXML
    void onSieteAction(ActionEvent event) {
    	calculadora.insertar('7');
    }

    @FXML
    void onSumarAction(ActionEvent event) {
    	calculadora.operar(Calculadora.SUMAR);
    }

    @FXML
    void onTresAction(ActionEvent event) {
    	calculadora.insertar('3');
    }

    @FXML
    void onUnoAction(ActionEvent event) {
    	calculadora.insertar('1');
    }



}
