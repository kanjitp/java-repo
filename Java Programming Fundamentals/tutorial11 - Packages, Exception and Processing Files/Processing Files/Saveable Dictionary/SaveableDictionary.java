package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SaveableDictionary {

    private ArrayList<String> firstLanguage;
    private ArrayList<String> secondLanguage;
    private String fileName;

    public SaveableDictionary(String file) {
        this();
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            this.fileName = file;
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                firstLanguage.add(parts[0]);
                secondLanguage.add(parts[1]);
            }
        } catch (Exception e) {
            // DO NOTHING: CHECK WITH load()
        }
    }

    public SaveableDictionary() {
        this.firstLanguage = new ArrayList<>();
        this.secondLanguage = new ArrayList<>();
        this.fileName = null;
    }

    public void add(String words, String translation) {
        if (!firstLanguage.contains(words) && !secondLanguage.contains(words)) {
            firstLanguage.add(words);
            secondLanguage.add(translation);
        }
    }

    public String translate(String word) {
        if (firstLanguage.contains(word)) {
            return secondLanguage.get(firstLanguage.indexOf(word));
        } else if (secondLanguage.contains(word)) {
            return firstLanguage.get(secondLanguage.indexOf(word));
        } else {
            return null;
        }
    }

    public void delete(String word) {
        String meaning = this.translate(word);
        firstLanguage.remove(word);
        firstLanguage.remove(meaning);
        secondLanguage.remove(word);
        secondLanguage.remove(meaning);
    }

    public boolean load() {
        return fileName != null;
    }

    public boolean save() {
        if (this.fileName == null) {
            return false;
        } else {
            try {
                PrintWriter writer = new PrintWriter(fileName);
                for (String word : firstLanguage) {
                    writer.println(word + ":" + translate(word));
                }
                writer.close();
                return true;
            } catch (Exception e) {
                System.out.println("ERROR DETECTED");
                return false;
            }

        }
    }
    @Override
    public String toString() {
        String s = "";
        for (String word : firstLanguage) {
            s += word + ":" + this.translate(word) + "\n";
        }
        return s;
    }

}
