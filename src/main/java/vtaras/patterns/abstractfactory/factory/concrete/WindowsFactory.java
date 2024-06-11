package vtaras.patterns.abstractfactory.factory.concrete;

import vtaras.patterns.abstractfactory.factory.AbstractFactory;
import vtaras.patterns.abstractfactory.products.Button;
import vtaras.patterns.abstractfactory.products.Checkbox;
import vtaras.patterns.abstractfactory.products.concrete.WindowsButton;
import vtaras.patterns.abstractfactory.products.concrete.WindowsCheckbox;

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
