package vtaras.patterns.behavioral.visitor;

/*
 * The Visitor pattern is a behavioral design pattern that allows adding new behaviors to existing object structures without modifying those structures
 *
 * It achieves this by separating the algorithm from the objects it operates on, promoting extensibility and maintainability of code
 */
public interface Visitor {

    String visit(ConcreteElementA element);

    String visit(ConcreteElementB element);
}
