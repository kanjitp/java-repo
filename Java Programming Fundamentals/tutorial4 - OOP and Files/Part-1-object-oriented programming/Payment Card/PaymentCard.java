public class PaymentCard {

    private double balance;

    // Constructor
    public PaymentCard() {
        this.balance = 0;
    }

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    // Methods
    public void addMoney(double amount) {
        if (amount > 0 ) this.balance += amount;
    }

    public void eatAffordably() {
        if (balance >= 2.60)
            this.balance -= 2.60;
    }

    public void eatHeartily() {
        if (balance >= 4.60)
            this.balance -= 4.60;
    }

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
