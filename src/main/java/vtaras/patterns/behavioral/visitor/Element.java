package vtaras.patterns.behavioral.visitor;

public interface Element {

    String accept(Visitor visitor);
}
