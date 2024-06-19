package vtaras.patterns.abstractfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vtaras.patterns.creational.abstractfactory.factory.AbstractFactory;
import vtaras.patterns.creational.abstractfactory.factory.concrete.MacFactory;
import vtaras.patterns.creational.abstractfactory.factory.concrete.WindowsFactory;
import vtaras.patterns.creational.abstractfactory.products.Button;
import vtaras.patterns.creational.abstractfactory.products.Checkbox;
import vtaras.patterns.creational.abstractfactory.products.concrete.MacButton;
import vtaras.patterns.creational.abstractfactory.products.concrete.MacCheckbox;
import vtaras.patterns.creational.abstractfactory.products.concrete.WindowsButton;
import vtaras.patterns.creational.abstractfactory.products.concrete.WindowsCheckbox;

class AbstractFactoryTest {

    @Test
    void testWindowsFactoryCreatesWindowsButton() {
        AbstractFactory factory = new WindowsFactory();
        Button button = factory.createButton();

        Assertions.assertInstanceOf(WindowsButton.class, button, "Button should be an instance of WindowsButton");
    }

    @Test
    void testWindowsFactoryCreatesWindowsCheckbox() {
        AbstractFactory factory = new WindowsFactory();
        Checkbox checkbox = factory.createCheckbox();

        Assertions.assertInstanceOf(WindowsCheckbox.class, checkbox, "Checkbox should be an instance of WindowsCheckbox");
    }

    @Test
    void testMacFactoryCreatesMacButton() {
        AbstractFactory factory = new MacFactory();
        Button button = factory.createButton();

        Assertions.assertInstanceOf(MacButton.class, button, "Button should be an instance of MacButton");
    }

    @Test
    void testMacFactoryCreatesMacCheckbox() {
        AbstractFactory factory = new MacFactory();
        Checkbox checkbox = factory.createCheckbox();

        Assertions.assertInstanceOf(MacCheckbox.class, checkbox, "Checkbox should be an instance of MacCheckbox");
    }

    @Test
    void testWindowsButtonHealthCheck() {
        Button button = new WindowsButton();

        Assertions.assertEquals("Rendering a button in Windows style.", button.healthCheck());
    }

    @Test
    void testWindowsCheckboxHealthCheck() {
        Checkbox checkbox = new WindowsCheckbox();

        Assertions.assertEquals("Rendering a checkbox in Windows style.", checkbox.healthCheck());
    }

    @Test
    void testMacButtonHealthCheck() {
        Button button = new MacButton();

        Assertions.assertEquals("Rendering a button in Mac style.", button.healthCheck());
    }

    @Test
    void testMacCheckboxHealthCheck() {
        Checkbox checkbox = new MacCheckbox();

        Assertions.assertEquals("Rendering a checkbox in Mac style.", checkbox.healthCheck());
    }
}
