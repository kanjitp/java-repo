import java.util.ArrayList;

public class Lists {

    /*
     * other types of ArrayList ArrayList<Integer> list = new ArrayList<>();
     * list.add(1); ArrayList<Double> list = new ArrayList<>(); list.add(4.2);
     * ArrayList<Boolean> list = new ArrayList<>(); list.add(true);
     * ArrayList<String> list = new ArrayList<>();
     * list.add("String is a reference-type variable");
     */
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();

        wordList.add("First");
        wordList.add("Second");

        System.out.println("This is index 0: " + wordList.get(0));

        /* Iterating over List */
        System.out.println("-- Iterating over the ArrayList<String> -- Size: " + wordList.size());
        int index = 0;
        while (index < wordList.size()) {
            System.out.println(wordList.get(index));
            index++;
        }
        System.out.println("-- exit while-loop");
        System.out.println("-- Removing index 0 ");
        wordList.remove(0); // can use index to remove but note that the next one is going to be pushed
                            // forward
        System.out.println("This is index 0: " + wordList.get(0));
        wordList.remove("Second");
        System.out.println("Size after removing \"Second\" :" + wordList.size());

        /*
         * for (int i = 0; i < wordlist.size(); i++) { int word = wordlist.get(i);
         * System.out.println(word); // alternatively:
         * System.out.println(wordlist.get(i)); }
         */

    }
}
