public class Warehouse {

    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        this.capacity = capacity;
        this.balance = 0;
        if (capacity <= 0) this.capacity = 0;
    }

    public double getBalance() {
        return this.balance;
    }
    public double getCapacity() {
        return this.capacity;
    }
    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount) {
        if (amount <= 0) return;
        if (this.balance + amount > this.capacity) {
            this.balance = this.capacity; 
            return;
        }
        this.balance += amount;
    }

    public double takeFromWarehouse(double amount) {
        if (amount <= 0) return 0;
        if (this.balance - amount < 0) {
            double temp = this.balance;
            this.balance = 0;
            return temp;
        }
        this.balance -= amount;
        return amount;
    }

    @Override
    public String toString() {
        return "balance = " + this.balance + ", space left " + this.howMuchSpaceLeft();
    }



    
}
