package application;

public class StandardSensor implements Sensor{

    private boolean state = true;
    private int reading;
    public StandardSensor(int reading) {
        this.reading = reading;
    }
    @Override 
    public boolean isOn() {
        return this.state;
    }

    @Override
    public void setOn() {
        // standard sensor is always on
    }
    @Override
    public void setOff() {
        // standard sensor is always on
    }
    @Override
    public int read() {
        return this.reading;
    }
    
}
