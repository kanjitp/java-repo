public class Bird {
    private String name;
    private String latinName;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    // accessor
    public String getName() {return this.name;}
    public String getLatinName() {return this.latinName;}

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.name + " (" + this.latinName + ")";
    }

    
}
