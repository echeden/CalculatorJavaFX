package y.calc;

public class Div implements Operation {
    @Override
    public String operate(String firstNumber, String secondNumber) {
        return Operation.numbersCheck(firstNumber, secondNumber)
                ? decimalFormat.format(Operation.castDouble(firstNumber)
                / Operation.castDouble(secondNumber))
                : emptyResult;
    }
}
