package creational.factoryMethod.factory;

import creational.factoryMethod.buttons.Button;
import creational.factoryMethod.buttons.WindowsButton;

import java.awt.*;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton(){
        return new WindowsButton();
    }

}
