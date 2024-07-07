package vtaras.patterns.behavioral.templatemethod;

public class WoodenHouse extends HouseTemplate {

    @Override
    String buildFoundation() {
        return "Building foundation with wood, iron rods, and gravel";
    }

    @Override
    String buildWalls() {
        return "Building wooden walls";
    }

    @Override
    String buildRoof() {
        return "Building wooden roof";
    }

    @Override
    String decorateHouse() {
        return "Decorating interior with wooden furniture";
    }
}
