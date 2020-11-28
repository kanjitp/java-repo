public class PersonalInformationCollection {
    private String firstName;
    private String lastName;
    private String id;

    // Constructor
    public PersonalInformationCollection() {
        this.firstName = "";
        this.lastName = "";
        this.id = "";
    }
    public PersonalInformationCollection(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.firstName + " " + this.lastName;
    }
    
}
