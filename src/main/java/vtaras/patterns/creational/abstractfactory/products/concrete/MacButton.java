package vtaras.patterns.creational.abstractfactory.products.concrete;

import vtaras.patterns.creational.abstractfactory.products.Button;

public class MacButton implements Button {

    @Override
    public String healthCheck() {
        return "Rendering a button in Mac style.";
    }
}
