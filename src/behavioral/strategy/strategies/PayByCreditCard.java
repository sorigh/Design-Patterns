package behavioral.strategy.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy{
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;
    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("paying " + paymentAmount + " using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("enter the card number: ");
            String number = READER.readLine();
            System.out.print("enter the card expiration date: ");
            String date = READER.readLine();
            System.out.print("enter the CVV code: ");
            String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    private boolean cardIsPresent() {
        return card != null;
    }
}
