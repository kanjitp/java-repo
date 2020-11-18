public class usingStrings {
    public static void main(String[] args) {
        // String comparison
        String text = "course";

        // Use of equal
        if (text.equals("this string")) {
            System.out.println("The two texts are equal!");
        } else {
            System.out.println("THe two texts are not equal!");
        }

        // Splitting a string
        String str = "first second third fourth";
        String[] pieces = str.split(" ");

        for (int i = 0; i < pieces.length; i++) {
            System.out.println(pieces[i]);
        }

        // contains-method
        String term = "volcanologist";
        if (term.contains("can")) {
            System.out.println("can was found");
        }
        if (!term.contains("tin")) {
            System.out.println("tin wasn't found");
        }
    }
    
}
