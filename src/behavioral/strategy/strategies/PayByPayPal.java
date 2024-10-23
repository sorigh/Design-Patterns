package behavioral.strategy.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PayByPayPal implements PayStrategy{
    private static final Map<String, String> DB = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email, password;
    private boolean signedIn;
    static {
        DB.put("1234", "a@g.com");
        DB.put("qwerty", "john@amazon.eu");
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.print("email: ");
                email = READER.readLine();
                System.out.print("password: ");
                password = READER.readLine();
                if (verify()) {
                    System.out.println("data verification has been successful.");
                } else {
                    System.out.println("wrong email or password!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("paying " + paymentAmount + " using PayPal.");
            return true;
        } else {
            return false;
        }
    }
    private boolean verify() {
        setSignedIn(email.equals(DB.get(password)));
        return signedIn;
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}
