public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }
    // getters
    public int euros() {
        return this.euros;
    }
    public int cents() {
        return this.cents;
    }
    // methods
    public Money toMoney(double number) {
        int integers = (int) number;
        int decimals = (int) Math.abs(Math.round((number - integers) * 100));
        return new Money(integers, (int)decimals);
    }
    public double toDouble (Money money) {
        return money.euros + money.cents / 100.0;
    }
    public Money plus(Money addition) {
        return toMoney(toDouble(this) + toDouble(addition));
    }
    public Money minus(Money decreaser){
        return toMoney(toDouble(this) - toDouble(decreaser));
    }
    public boolean lessThan(Money compared) {
        return this.euros < compared.euros 
            ? true 
            : this.euros == compared.euros 
                ? this.cents < compared.cents 
                : false;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }
        return  euros + "." + zero + cents + "e";
    }

    
}
