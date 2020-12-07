package application;

import java.util.*;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> records;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.records = new ArrayList<>();
    }

    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    public List<Integer> readings() {
        return records;
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn())
                return false;
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (this.isOn()) {
            int sum = 0;
            for (Sensor sensor : sensors) {
                int reading = sensor.read();
                sum += reading;
            }
            records.add(sum / sensors.size());
            return sum / sensors.size();
        } else {
            throw new IllegalStateException("some sensors are still off");
        }
    }

}
