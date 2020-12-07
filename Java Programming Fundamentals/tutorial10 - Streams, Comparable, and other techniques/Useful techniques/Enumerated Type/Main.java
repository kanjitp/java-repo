public class Main {
    public static enum Suit {
        DIAMOND, SPADE, CLUB, HEART
    }
    public static void main(String[] args) {
        Card first = new Card(10, Suit.HEART);

        System.out.println(first);

        if (first.getSuit().ordinal() == Suit.HEART.ordinal()) {
            System.out.println("is a heart");
        } else {
            System.out.println("is not a heart");
        }
    }


    
}
