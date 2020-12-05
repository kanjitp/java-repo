public class Fitbyte {

    private int age;
    private int restingHeartRate;
    private Person person;

    public Fitbyte(int age, int restingHeartRate, Person person) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
        this.person = person;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        return ((double) this.person.maximumHeartRate() - this.restingHeartRate) 
                                * percentageOfMaximum + this.restingHeartRate;
    }

}
