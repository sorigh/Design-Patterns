package creational.abstractFactory.factories;

import creational.abstractFactory.buttons.Button;
import creational.abstractFactory.buttons.WindowsButton;
import creational.abstractFactory.checkboxes.Checkbox;
import creational.abstractFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
