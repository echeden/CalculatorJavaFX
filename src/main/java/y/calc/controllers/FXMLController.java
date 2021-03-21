package y.calc.controllers;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import y.calc.logic.math.MathOperations;
import y.calc.logic.math.MathSimpleOperations;
import y.calc.logic.math.Operator;


public class FXMLController implements Initializable {

    // Labels
    @FXML
    private Label labelResult;

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

    // Utils
    final private MathOperations math = new MathSimpleOperations();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        DecimalFormat decimalFormat = new DecimalFormat("##.###");

        Pattern p = Pattern.compile("(\\d+\\.?\\d*)?");

        firstNumber.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!p.matcher(newValue).matches())
                firstNumber.setText(oldValue);
        });

        secondNumber.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!p.matcher(newValue).matches())
                secondNumber.setText(oldValue);
        });

        labelResult.getStyleClass().add("label1");

        buttonSum.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent ->
                labelResult.setText(decimalFormat.format(math.operate(Operator.PLUS,
                        Double.parseDouble(firstNumber.getText()),
                        Double.parseDouble(secondNumber.getText())))
                ));

        buttonSubtraction.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent ->
                labelResult.setText(decimalFormat.format(math.operate(Operator.MINUS,
                        Double.parseDouble(firstNumber.getText()),
                        Double.parseDouble(secondNumber.getText()))
                ))
        );

        buttonMultiplication.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent ->
                labelResult.setText(decimalFormat.format(math.operate(Operator.MULTIPLY,
                        Double.parseDouble(firstNumber.getText()),
                        Double.parseDouble(secondNumber.getText()))
                ))
        );
        buttonDivision.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent ->
                labelResult.setText(decimalFormat.format(math.operate(Operator.DIV,
                        Double.parseDouble(firstNumber.getText()),
                        Double.parseDouble(secondNumber.getText()))
                ))
        );
    }
}