package creational.abstractFactory;

import creational.abstractFactory.app.Application;
import creational.abstractFactory.factories.GUIFactory;
import creational.abstractFactory.factories.MacOSFactory;
import creational.abstractFactory.factories.WindowsFactory;

public class Demo {
    private static Application configureApplication(){
        Application app;
        GUIFactory factory;
        factory = new WindowsFactory();
       // factory = new MacOSFactory();
        app = new Application(factory);

        return app;
    }
    public static void main(String[] args){
        Application app = configureApplication();
        app.paint();
    }
}
