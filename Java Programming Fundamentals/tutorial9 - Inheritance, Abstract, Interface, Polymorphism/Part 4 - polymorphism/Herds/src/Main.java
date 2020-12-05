import javax.swing.PopupFactory;

public class Main {
    public static void main(String[] args) {
        Herd herd = new Herd();
        herd.addToHerd(new Organism(57, 66));
        herd.addToHerd(new Organism(73, 56));
        herd.addToHerd(new Organism(46, 52));
        herd.addToHerd(new Organism(19, 107));
        System.out.println(herd);

        System.out.println("== MOVE (8, 13) ==");
        herd.move(8, 13);
        System.out.println(herd);
    }

}
