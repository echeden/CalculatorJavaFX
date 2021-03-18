package y.calc;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class FXMLController implements Initializable {

    // Labels
    @FXML
    private Label result;

    // Buttons
    @FXML
    private Button buttonSum;
    @FXML
    private Button buttonSubtraction;
    @FXML
    private Button buttonMultiplication;
    @FXML
    private Button buttonDivision;

    // TextFields
    @FXML
    private TextField firstNumber;
    @FXML
    private TextField secondNumber;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        result.getStyleClass().add("label1");
        // buttonsBehavior
        // sum
        buttonSum.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent ->
                result.setText(new Sum().operate(firstNumber.getText(), secondNumber.getText())));
        // subtraction
        buttonSubtraction.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent ->
                result.setText(new Sub().operate(firstNumber.getText(), secondNumber.getText())));
        // multiplication
        buttonMultiplication.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent ->
                result.setText(new Multi().operate(firstNumber.getText(), secondNumber.getText())));
        // division
        buttonDivision.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent ->
                result.setText(new Div().operate(firstNumber.getText(), secondNumber.getText())));
    }
}