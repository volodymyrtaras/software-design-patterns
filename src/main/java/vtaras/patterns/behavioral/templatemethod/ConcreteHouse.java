package vtaras.patterns.behavioral.templatemethod;

public class ConcreteHouse extends HouseTemplate {

    @Override
    String buildFoundation() {
        return "Building foundation with concrete, cement, and steel bars";
    }

    @Override
    String buildWalls() {
        return "Building concrete walls";
    }

    @Override
    String buildRoof() {
        return "Building concrete roof";
    }

    @Override
    String decorateHouse() {
        return "Decorating interior with modern furniture";
    }

    @Override
    boolean addExtraFeatures() {
        return false;
    }
}
