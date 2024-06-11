package vtaras.patterns.abstractfactory.products.concrete;

import vtaras.patterns.abstractfactory.products.Button;

public class WindowsButton implements Button {

    @Override
    public String healthCheck() {
        return "Rendering a button in Windows style.";
    }
}
