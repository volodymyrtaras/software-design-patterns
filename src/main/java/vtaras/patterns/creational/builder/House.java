package vtaras.patterns.creational.builder;

/*
 * The Builder pattern separates the construction of a complex object from its representation,
 * allowing the same construction process to create different representations
 *
 * It involves a Builder class definition with methods for building parts of the object
 */
public class House {

    private final String foundation;
    private final String structure;
    private final String roof;
    private final String interior;

    private House(HouseBuilder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.interior = builder.interior;
    }

    public String getFoundation() {
        return foundation;
    }

    public String getStructure() {
        return structure;
    }

    public String getRoof() {
        return roof;
    }

    public String getInterior() {
        return interior;
    }

    public static HouseBuilder builder() {
        return new HouseBuilder();
    }

    public static class HouseBuilder {

        private String foundation;
        private String structure;
        private String roof;
        private String interior;

        public HouseBuilder foundation(String foundation) {
            this.foundation = foundation;

            return this;
        }

        public HouseBuilder structure(String structure) {
            this.structure = structure;

            return this;
        }

        public HouseBuilder roof(String roof) {
            this.roof = roof;

            return this;
        }

        public HouseBuilder interior(String interior) {
            this.interior = interior;

            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
