public class Main {
    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(book);
        suitcase.addItem(phone);
        suitcase.addItem(brick);

        System.out.println("The suitcase contains the following items:");
        suitcase.printItems();
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");
        Item heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);

        System.out.println("== Ada and Pekka cases ==");

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);
        
        System.out.println("Ada suitcase total weight: " + adasCase.totalWeight());
        System.out.println("Pekka suitcase total weight: " + pekkasCase.totalWeight());
        System.out.println(hold);
        System.out.println("-- The suitcases in the hold contain the following items:");
        hold.printItems();
    }
    
}
