public class Movie {

    private String name;
    private int publishingYear;

    public Movie(String name, int publishingYear) {
        this.name = name;
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return this.name + " ("  + this.publishingYear + ")";
    }
    
}
