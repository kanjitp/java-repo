public class Timer {

    private ClockHand centiseconds;
    private ClockHand seconds;

    public Timer() {
        this.centiseconds = new ClockHand(99);
        this.seconds = new ClockHand(59);
    }

    public void advance() {
        this.centiseconds.advance();
        if (centiseconds.value() == 0) {
            this.seconds.advance();
        }
    }

    @Override
    public String toString() {
        return this.seconds + ":" +this.centiseconds;
    }
    
}
