package vtaras.patterns.creational.prototype;

class ConcretePrototype1 implements Prototype {

    private final String field1;

    public ConcretePrototype1(String field1) {
        this.field1 = field1;
    }

    public String getField1() {
        return field1;
    }

    @Override
    @SuppressWarnings(value = "MethodDoesntCallSuperMethod")
    public Prototype clone() {
        return new ConcretePrototype1(this.field1);
    }
}
