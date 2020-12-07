package application;

public class TemperatureSensor implements Sensor{

    private boolean state;
    private int reading;


    public TemperatureSensor() {
        this.state = false;
        this.reading = 0;
    }

    @Override
    public boolean isOn() {
        return this.state;
    }
    @Override
    public void setOn() {
        this.state = true;
    }
    @Override
    public void setOff() {
        this.state = false;
    }
    @Override 
    public int read() {
        if (this.state) {
            return (int) (Math.random() * 60 - 30);
        } else {
            throw new IllegalStateException("Sensor is currently off");
        }
    }


    
}
