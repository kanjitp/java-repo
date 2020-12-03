import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> postalCodes = new HashMap<>();
        // <first value, second value> :
        // first value = Key
        // second value = value associated to that key
        postalCodes.put("00710", "Helsinki");
        postalCodes.put("90014", "Oulu");
        postalCodes.put("33720", "Tampere");
        postalCodes.put("33014", "Tampere");

        System.out.println(postalCodes.get("00710")); // Helsinki
        System.out.println(postalCodes.get("12345")); // no key - return null

        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "arthie");
        // note that HashMap is not iterable
        System.out.println(nicknames.get("matthew"));


        /**
         * Hash map has a maximum of one value per key
         * if the same key is provided the old value will vanish from the hash map
         */
    }

}
