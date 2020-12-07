public class Card {
    public static enum Suit {
        DIAMOND, SPADE, CLUB, HEART
    }

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return suit + " " + value;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        Card first = new Card(10, Suit.HEART);

        System.out.println(first);

        if (first.getSuit() == Suit.HEART) { // can compare directly within the same class
            System.out.println("is a heart");
        } else {
            System.out.println("is not a heart");
        }

        System.out.println(Suit.CLUB.ordinal());
        System.out.println(Suit.SPADE.ordinal());
    }

}
