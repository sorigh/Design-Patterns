package creational.factoryMethod.buttons;

public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("<button> button </button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("click!");
    }
}
