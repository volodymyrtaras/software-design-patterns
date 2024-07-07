package vtaras.patterns.behavioral.visitor;

public class ConcreteElementB implements Element {

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }

    String operationB() {
        return "ConcreteElementB operation";
    }
}
