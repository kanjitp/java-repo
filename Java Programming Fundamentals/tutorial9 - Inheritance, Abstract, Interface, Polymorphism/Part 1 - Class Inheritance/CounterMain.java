public class CounterMain {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter superCounter = new SuperCounter();
        int number = 3;
        number = superCounter.addToNumber(number);
        number = counter.subtractFromNumber(number);
        number = counter.addToNumber(number);
        System.out.println(number);
    }

}
