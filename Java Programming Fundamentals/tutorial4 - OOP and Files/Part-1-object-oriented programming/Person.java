public class Person {

    // Variables defined inside a calss are called `instance variables`
    private String name;
    private int age;
    private int weight;
    private int height;


    // Defining a Constructor

    public Person(String initialName) {
        this.age = 0;
        this.weight = 0;
        this.height = 0;
        this.name = initialName;
    }
    // Defining Getter
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public int getWeight() {
        return this.weight;
    }
    public int getHeight() {
        return this.height;
    }
    //Defining Setter
    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    // Defining Methods for an Object
    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void growOlder() {
        this.age += 1;
    }

     public boolean isOfLegalAge() {
         return this.age >= 18;
     }

     public double bodyMassIndex() {
         double heightPerHundred = this.height / 100.0;
         return this.weight / (heightPerHundred * heightPerHundred);
     }
     
     public String toString() {
        return this.name + ", age " + this.age + " years";
     }

    /*
     * Additional Notes: Objects and the Static Modifier: static modifier indicates
     * that the method in question does not belong to an object and thus cannot be
     * used to access any variables that belon to objects.
     * 
     * methods will not include static keywords IF they're used to process
     * information about objects methods will include static keywords IF method
     * receives as parameters all the variables whose it uses
     * 
     */

}
