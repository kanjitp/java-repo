public class Clock {
    private ClockHand hours;
    private ClockHand minutes;
    private ClockHand seconds;

    public Clock() {
        this.hours = new ClockHand(23);
        this.minutes = new ClockHand(59);
        this.seconds = new ClockHand(59);
    }

    public void advance() {
        this.seconds.advance();

        if (this.seconds.value() == 0) {
            this.minutes.advance();
            if (this.minutes.value() == 0) {
                this.hours.advance();
            }
        }

    }
    @Override
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
    
}
