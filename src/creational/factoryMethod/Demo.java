package creational.factoryMethod;

import creational.factoryMethod.factory.Dialog;
import creational.factoryMethod.factory.HtmlDialog;
import creational.factoryMethod.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }
    static void configure() {
        dialog = new WindowsDialog();
        //dialog = new HtmlDialog();
    }
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
