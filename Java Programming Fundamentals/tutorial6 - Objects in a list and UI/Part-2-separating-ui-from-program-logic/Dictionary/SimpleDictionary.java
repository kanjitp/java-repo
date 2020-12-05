import java.util.*;

public class SimpleDictionary {

    private ArrayList<String> words;
    private ArrayList<String> meanings;

    public SimpleDictionary() {
        this.words = new ArrayList<>();
        this.meanings = new ArrayList<>();
    }

    public void add(String word, String meaning) {
        if (!words.contains(word)) {
            words.add(word);
            meanings.add(meaning);
        }
    }
    public String translate(String word) {
        if(words.contains(word)) {
            return meanings.get(words.indexOf(word));
        }
        return null;
    }
}