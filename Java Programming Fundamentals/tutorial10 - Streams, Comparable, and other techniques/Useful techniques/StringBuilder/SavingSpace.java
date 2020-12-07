public class SavingSpace {
    public static void main(String[] args) {
        // to save space when concatanating string
        StringBuilder numbers = new StringBuilder();
        for (int i = 1; i < 5; i++) {
            numbers.append(i);
        }
        System.out.println(numbers.toString());
    }

    // String numbers = ""; // creating a new string: ""
    // int i = 1;
    // // first creating the string "1" and then the string "1\n"
    // numbers=numbers+i+"\n";i++;
    // // first creating the string "1\n2" and then the string "1\n2\n"
    // numbers=numbers+i+"\n"i++;
    // // first creating the string "1\n2\n3" and then the string "1\n2\n3\n"
    // numbers=numbers+i+"\n"i++;
    // // and so on
    // numbers=numbers+i+"\n"i++;

    // System.out.println(numbers); // outputting the string

    // THE EXAMPLE ABOVE CREATES 9 SEPARATE STRING BEFORE CONCATANATING
}