package vtaras.patterns.abstractfactory.factory.concrete;

import vtaras.patterns.abstractfactory.factory.AbstractFactory;
import vtaras.patterns.abstractfactory.products.Button;
import vtaras.patterns.abstractfactory.products.Checkbox;
import vtaras.patterns.abstractfactory.products.concrete.MacButton;
import vtaras.patterns.abstractfactory.products.concrete.MacCheckbox;

public class MacFactory implements AbstractFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
