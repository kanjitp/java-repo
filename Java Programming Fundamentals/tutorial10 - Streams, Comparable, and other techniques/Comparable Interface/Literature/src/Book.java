public class Book implements Comparable<Book> {

    private String name;
    private int ageRecommendation;

    public Book(String name, int age) {
        this.name = name;
        this.ageRecommendation = age;
    }

    @Override
    public String toString() {
        return this.name + "(recommended for " + this.ageRecommendation + " year-olds or older)";
    }
    @Override
    public int compareTo(Book book) {
        return this.ageRecommendation - book.ageRecommendation;
    }
}
