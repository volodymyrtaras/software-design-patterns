package vtaras.patterns.behavioral.visitor;

public class ConcreteElementA implements Element {

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }

    String operationA() {
        return "ConcreteElementA operation";
    }
}
