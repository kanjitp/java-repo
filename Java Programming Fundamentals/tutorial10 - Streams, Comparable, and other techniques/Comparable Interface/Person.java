public class Person implements Identifiable, Comparable<Person> {

    private String name;
    private String socialSecurtyNumber;

    public Person(String name, String socialSecurityNumber) {
        this.name = name;
        this.socialSecurtyNumber = socialSecurityNumber;
    }

    public String getName() {
        return this.name;
    }
    public String getSocialSecurityNumber() {
        return this.socialSecurtyNumber;
    }

    @Override
    public String getId() {
        return getSocialSecurityNumber();
    }

    @Override
    public int compareTo(Person another) {
        return this.getId().compareTo(another.getId());
    }
    
}
