public class Counter {

    private int value;

    // Constructor
    public Counter() {
        this(0);
    }
    public Counter(int startValue) {
        this.value = startValue;
    }
    // Methods
    public int value() {
        return this.value;
    }
    public void increase() {
        increase(1);
    }
    public void increase(int increaseBy) {
        this.value += increaseBy;
    }
    public void decrease() {
        decrease(1);
    }
    public void decrease(int decreaseBy) {
        this.value -= decreaseBy;
    }
    
}
