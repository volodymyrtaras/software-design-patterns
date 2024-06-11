package vtaras.patterns.abstractfactory.products.concrete;

import vtaras.patterns.abstractfactory.products.Checkbox;

public class MacCheckbox implements Checkbox {

    @Override
    public String healthCheck() {
        return "Rendering a checkbox in Mac style.";
    }
}
