import java.util.Scanner;

public class readingUserInput {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Examples of reading different types of user input
        String text = reader.nextLine();
        int number = Integer.valueOf(reader.nextLine());
        double numberWithDecimals = Double.valueOf(reader.nextLine());
        boolean trueOrFalse = Boolean.valueOf(reader.nextLine());

        System.out.println(text);
        System.out.println(number);
        System.out.println(numberWithDecimals);
        System.out.println(trueOrFalse);

        reader.close();

    }
}
