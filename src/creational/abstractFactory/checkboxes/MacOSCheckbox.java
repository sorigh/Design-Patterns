package creational.abstractFactory.checkboxes;

public class MacOSCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("you created a mac checkbox");
    }
}
