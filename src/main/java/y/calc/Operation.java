package y.calc;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

public interface Operation {
    String regex = String.valueOf(Pattern.compile("\\D|^$"));
    String emptyResult = "";
    DecimalFormat decimalFormat = new DecimalFormat("#.###");

    String operate(String firstNumber, String secondNumber);

    static boolean numbersCheck(String firstNumber, String secondNumber) {
        return !Pattern.matches(regex, firstNumber)
                && !Pattern.matches(regex, secondNumber);
    }
    static Double castDouble(String number) {
        return Double.parseDouble(number);
    }
}
