package vtaras.patterns.creational.abstractfactory.factory.concrete;

import vtaras.patterns.creational.abstractfactory.factory.AbstractFactory;
import vtaras.patterns.creational.abstractfactory.products.Button;
import vtaras.patterns.creational.abstractfactory.products.Checkbox;
import vtaras.patterns.creational.abstractfactory.products.concrete.WindowsButton;
import vtaras.patterns.creational.abstractfactory.products.concrete.WindowsCheckbox;

public class WindowsFactory implements AbstractFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
