public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    // Constructor
    // public Person(String name) {
    // // removing unecesscary code by using the constructor with longest signature
    // this.name = name;
    // this.age = 0;
    // this.weight = 0;
    // this.height = 0;
    // }

    public Person(String name) {
        this(name, 0, 0, 0);
    }

    // Overloading Constructor
    public Person(String name, int age) {
        this(name, age, 0, 0);
    }

    public Person(String name, int age, int height) {
        this(name, age, height, 0);
    }

    // ** USE THIS **
    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void printPerson() {
        System.out.println(this.name + " is " + this.age + " years old");
    }

    public void growOlder() {
        this.age++;
    }

    public boolean isAdult() {
        if (this.age < 18) {
            return false;
        }

        return true;
    }

    public double bodyMassIndex() {
        double heightInMeters = this.height / 100.0;

        return this.weight / (heightInMeters * heightInMeters);
    }

    public String toString() {
        return this.name + " is " + this.age + " years old, their BMI is " + this.bodyMassIndex();
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }
}
