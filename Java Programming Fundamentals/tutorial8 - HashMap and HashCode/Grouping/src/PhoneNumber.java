import java.util.*;

public class PhoneNumber {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneNumbers = new HashMap<>();
        
        // initially attach an empty list to the name Pekka
        phoneNumbers.put("Pekka", new ArrayList<>());

        // add phone numbers
        phoneNumbers.get("Pekka").add("040-1234564");
        phoneNumbers.get("Pekka").add("040-3939452");

        System.out.println("Pekka's numbers: " + phoneNumbers.get("Pekka"));
    }
}