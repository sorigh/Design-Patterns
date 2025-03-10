package behavioral.strategy;

import behavioral.strategy.order.Order;
import behavioral.strategy.strategies.PayByCreditCard;
import behavioral.strategy.strategies.PayByPayPal;
import behavioral.strategy.strategies.PayStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    private static final Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final Order order = new Order();
    private static PayStrategy strategy;
    static {
        priceOnProducts.put(1, 2000);
        priceOnProducts.put(2, 1800);
        priceOnProducts.put(3, 1500);
        priceOnProducts.put(4, 800);
    }
    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;
            String continueChoice;
            do {
                System.out.print("""
                        select a product:
                        1 - mother board
                        2 - CPU
                        3 - HDD
                        4 - memory
                        """);
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.print("count: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.print("do you wish to continue selecting products? Y/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("""
                        select a payment method:
                        1 - PayPal
                        2 - Credit Card""");
                String paymentMethod = reader.readLine();

                if (paymentMethod.equals("1")) {
                    strategy = new PayByPayPal();
                } else {
                    strategy = new PayByCreditCard();
                }
            }
            order.processOrder(strategy);
            if (strategy.pay(order.getTotalCost())) {
                System.out.println("Payment has been successful.");
            } else {
                System.out.println("FAIL! Please, check your data.");
            }
            order.setClosed();
        }
    }
}
