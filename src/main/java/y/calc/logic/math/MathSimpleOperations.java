package y.calc.logic.math;

import y.calc.logic.math.errors.InvalidOperatorError;

public class MathSimpleOperations implements MathOperations {
    private Double plus(Double num1, Double num2) {
        return num1 + num2;
    }

    private Double minus(Double num1, Double num2) {
        return num1 - num2;
    }

    private Double div(Double dividend, Double divider) {
        return dividend / divider;
    }

    private Double multiply(Double num1, Double num2) {
        return num1 * num2;
    }

    @Override
    public Double operate(Operator operator, Double num1, Double num2) {
        switch (operator){
            case PLUS:
                return plus(num1, num2);
            case MINUS:
                return minus(num1, num2);
            case DIV:
                return div(num1, num2);
            case MULTIPLY:
                return multiply(num1, num2);
            default:
                throw new InvalidOperatorError();
        }
    }
}
