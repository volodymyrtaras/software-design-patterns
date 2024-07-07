package vtaras.patterns.behavioral.interpreter;

public class Subtract implements Expression {

    private final Expression leftExpression;
    private final Expression rightExpression;

    public Subtract(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public int interpret() {
        return leftExpression.interpret() - rightExpression.interpret();
    }
}
