package vtaras.patterns.behavioral.interpreter;

public class Number implements Expression {

    private final int number;

    public Number(int number) {
        this.number = number;
    }

    public int interpret() {
        return number;
    }
}
