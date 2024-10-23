package creational.factoryMethod.factory;

import creational.factoryMethod.buttons.Button;
import creational.factoryMethod.buttons.HtmlButton;

import java.awt.*;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton(){
        return new HtmlButton();
    }
}
