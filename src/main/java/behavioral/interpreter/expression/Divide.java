package behavioral.interpreter.expression;

public class Divide implements Expression {
    private Expression left;
    private Expression right;

    public Divide(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        int divisor = right.interpret();
        if (divisor == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        return left.interpret() / divisor;
    }
}
