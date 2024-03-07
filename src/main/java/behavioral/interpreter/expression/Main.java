package behavioral.interpreter.expression;

public class Main {
    public static void main(String[] args) {
        String input = "5 * (7 - 2)"; // 사용자 입력 대신 문자열 직접 할당

        ExpressionParser parser = new ExpressionParser();
        Expression expression = parser.parse(input);
        int result = expression.interpret();
        System.out.println("Result: " + result);
    }
}
