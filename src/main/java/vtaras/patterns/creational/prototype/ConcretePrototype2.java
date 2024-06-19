package vtaras.patterns.creational.prototype;

class ConcretePrototype2 implements Prototype {

    private final int field2;

    public ConcretePrototype2(int field2) {
        this.field2 = field2;
    }

    public int getField2() {
        return field2;
    }

    @Override
    @SuppressWarnings(value = "MethodDoesntCallSuperMethod")
    public Prototype clone() {
        return new ConcretePrototype2(this.field2);
    }
}
