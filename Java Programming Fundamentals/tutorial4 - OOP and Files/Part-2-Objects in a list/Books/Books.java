public class Books {

    private String title;
    private int pages;
    private int publicationYear;

    // Constructor
    public Books() {
           
    }
    public Books(String title) {
        this.title = title;
    }
    public Books(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
    public Books(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    // getter
    public String getTitle() {
        return this.title;
    }
    public int getPages() {
        return this.pages;        
    }
    public int getYear() {
        return this.publicationYear;
    }

    // Methods
    @Override
    public String toString() {
        return this.title + ", " + this.pages+ " pages, " + this.publicationYear;
    }

    
}
