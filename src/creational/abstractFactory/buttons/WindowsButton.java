package creational.abstractFactory.buttons;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("you created a windows button");
    }
}
