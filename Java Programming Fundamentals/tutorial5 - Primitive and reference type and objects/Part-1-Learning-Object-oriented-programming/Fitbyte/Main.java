public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jason", 9, 153, 48);
        Fitbyte assistant = new Fitbyte(30, 60, person);

        double percentage = 0.5;

        while (percentage < 1.0) {
            double target = assistant.targetHeartRate(percentage);
            System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
            percentage = percentage + 0.1;
        }
    }

}
