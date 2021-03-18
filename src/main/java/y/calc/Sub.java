package y.calc;

public class Sub implements Operation {
    @Override
    public String operate(String firstNumber, String secondNumber) {
        return Operation.numbersCheck(firstNumber, secondNumber)
                ? decimalFormat.format(Operation.castDouble(firstNumber)
                - Operation.castDouble(secondNumber))
                : emptyResult;
    }
}
