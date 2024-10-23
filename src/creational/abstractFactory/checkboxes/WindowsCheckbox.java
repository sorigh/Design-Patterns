package creational.abstractFactory.checkboxes;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("you created a windows checkbox");
    }
}
