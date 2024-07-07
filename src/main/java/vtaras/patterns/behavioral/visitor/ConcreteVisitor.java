package vtaras.patterns.behavioral.visitor;

public class ConcreteVisitor implements Visitor {

    @Override
    public String visit(ConcreteElementA element) {
        return "Visitor is processing " + element.operationA();
    }

    @Override
    public String visit(ConcreteElementB element) {
        return "Visitor is processing " + element.operationB();
    }
}
