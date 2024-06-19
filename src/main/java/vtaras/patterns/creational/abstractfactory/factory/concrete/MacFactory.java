package vtaras.patterns.creational.abstractfactory.factory.concrete;

import vtaras.patterns.creational.abstractfactory.factory.AbstractFactory;
import vtaras.patterns.creational.abstractfactory.products.Button;
import vtaras.patterns.creational.abstractfactory.products.Checkbox;
import vtaras.patterns.creational.abstractfactory.products.concrete.MacButton;
import vtaras.patterns.creational.abstractfactory.products.concrete.MacCheckbox;

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
