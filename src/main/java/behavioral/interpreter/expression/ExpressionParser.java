package behavioral.interpreter.expression;

import java.util.Stack;

public class ExpressionParser {
    public Expression parse(String input) {
        String[] tokens = input.split(" ");
        Stack<Expression> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                stack.push(getOperatorExpression(token, left, right));
            } else {
                stack.push(new Number(Integer.parseInt(token)));
            }
        }

        return stack.pop();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private Expression getOperatorExpression(String token, Expression left, Expression right) {
        switch (token) {
            case "+":
                return new Add(left, right);
            case "-":
                return new Subtract(left, right);
            case "*":
                return new Multiply(left, right);
            case "/":
                return new Divide(left, right);
            default:
                throw new IllegalArgumentException("Invalid operator: " + token);
        }
    }
}
