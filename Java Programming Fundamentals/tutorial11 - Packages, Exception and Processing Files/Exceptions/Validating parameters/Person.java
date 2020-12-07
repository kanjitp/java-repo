public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name.length() > 40) {
            throw new IllegalArgumentException("Name must be less than equal to 40");
        } else if (name.equals("")) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid Age: Only 0-120");
        }
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.age + ")";
    }
    
}
