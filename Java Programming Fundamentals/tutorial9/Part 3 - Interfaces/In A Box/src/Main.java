public class Main {

    public static void main(String[] args) {
        Box jasonbox = new Box(10);

        jasonbox.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        jasonbox.add(new Book("Robert Martin", "Clean Code", 1));
        jasonbox.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        jasonbox.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        jasonbox.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        jasonbox.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println("Jason " + jasonbox);

        Box marybox = new Box(5);

        marybox.add(new Book("J.K. Tolling","Harry Popper and the Kant's Stone", 3));

        marybox.add(new CD("The Tolling Stones", "When I was your love", 1969));

        System.out.println("Mary " + marybox);
        
        Box packagebox = new Box(50);

        packagebox.add(jasonbox);
        packagebox.add(marybox);

        System.out.println("Package " + packagebox);
    }

}
