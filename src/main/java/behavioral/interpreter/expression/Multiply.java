package behavioral.interpreter.expression;

public class Multiply implements Expression {
    private Expression left;
    private Expression right;

    public Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() * right.interpret();
    }
}
