package vtaras.patterns.creational.abstractfactory.products.concrete;

import vtaras.patterns.creational.abstractfactory.products.Checkbox;

public class WindowsCheckbox implements Checkbox {

    @Override
    public String healthCheck() {
        return "Rendering a checkbox in Windows style.";
    }
}
