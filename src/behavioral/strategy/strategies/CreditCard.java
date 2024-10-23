package behavioral.strategy.strategies;

public class CreditCard {
    private int amount;
    private final String number;
    private final String date;
    private final String cvv;
    CreditCard(String number, String date, String cvv) {
        this.amount = 10000;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
}
