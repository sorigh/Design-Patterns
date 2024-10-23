package creational.factoryMethod.factory;

import java.awt.*;
import creational.factoryMethod.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
