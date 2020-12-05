public class Statistics {
    private int count;
    private int sum;

    // Constructor
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }
    // Getter
    public int getCount() {
        return this.count;
    }
    // Method
    public void addNumber(int number) {
        this.sum += number;
        this.count += 1;
    }
    public int sum() {
        return this.sum;
    }
    public double average() { // remember to change to double
        return (double)this.sum / this.count;
    }

    
}
