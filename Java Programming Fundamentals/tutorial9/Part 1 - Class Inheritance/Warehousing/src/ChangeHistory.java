import java.util.*;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }
    public double maxValue() {
        double max = history.get(0);
        for (double value : history) {
            if (max < value) max = value;
        }
        return max;
    }

    public double minValue() {
        double min = history.get(0);
        for (double value : history) {
            if (min > value) min = value;
        }
        return min;
    }

    public double average() {
        double sum = 0;
        for (double value : history) {
            sum += value;
        }
        return sum / history.size();
    }
    public int size() {
        return history.size();
    }
    public double get(int index) {
        return history.get(index);
    }
    @Override
    public String toString() {
        return this.history.toString();
    }
    

    
}
