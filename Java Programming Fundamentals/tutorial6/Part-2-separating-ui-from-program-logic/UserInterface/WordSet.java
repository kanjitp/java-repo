import java.util.*;

public class WordSet {

    private ArrayList<String> wordSet;

    public WordSet() {
        this.wordSet = new ArrayList<>();
    }
    public boolean contains(String word) {
        return wordSet.contains(word);
    }
    public void add(String word) {
        this.wordSet.add(word);
    }
    public boolean isPalindrome(String word) {
        int end = word.length() - 1;
        int i = 0;
        while (i < word.length() / 2) {
            if (word.charAt(i) != word.charAt(end - i)) return false;
            i ++;
        }
        return true;
    }
    
}
