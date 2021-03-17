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
        buttonSum.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (!firstNumber.getText().equals("")
                        && !secondNumber.getText().equals("")) {
                    result.setText(String.valueOf(Double.parseDouble(firstNumber.getText()) +
                            Double.parseDouble(secondNumber.getText())));
                }
            }
        });
        // subtraction
        buttonSubtraction.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (!firstNumber.getText().equals("")
                        && !secondNumber.getText().equals(""))
                    result.setText(String.valueOf(Double.parseDouble(firstNumber.getText()) -
                            Double.parseDouble(secondNumber.getText())));
            }
        });
        // multiplication
        buttonMultiplication.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (!firstNumber.getText().equals("")
                        && !secondNumber.getText().equals(""))
                    result.setText(String.valueOf(Double.parseDouble(firstNumber.getText()) *
                            Double.parseDouble(secondNumber.getText())));
            }
        });
        // division
        buttonDivision.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (!firstNumber.getText().equals("")
                        && !secondNumber.getText().equals(""))
                    result.setText(String.valueOf(Double.parseDouble(firstNumber.getText()) /
                            Double.parseDouble(secondNumber.getText())));
            }
        });
    }

}