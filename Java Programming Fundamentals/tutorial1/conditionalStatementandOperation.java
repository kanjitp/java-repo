import java.util.Scanner;

public class conditionalStatementandOperation {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            if(true) {
                System.out.println("This code is unavoidable!");
            }
            //binary operators: > < >= <= == !=
            if (false) {
                System.out.println("This code is unreachable!");
            } else {
                System.out.println("Which makes this one unavoidable!");
            }

            if (false) {
                System.out.println("This code is unreachable!");
            } else if (false) {
                System.out.println("This is not reached until until the previous one is false");
            } else if (false) {
                System.out.println("Same as this one ...");
            } else if (true) {
                System.out.println("true ... finally!");
            }

            // COMPARING STRINGS
            String s1 = "This is a string";
            String s2 = "This is a string";
            System.out.println("Type: \"This is a string \" for s3:");
            String s3 = sc.nextLine();
            System.out.println("s1 == s2: " + (s1 == s2));              //return true; // java saves the space
            System.out.println("s1 == s3: " + (s1 == s3));              //new memory is allocated for Scanner
            System.out.println("s1.equals(s2): " + s1.equals((s2)));    //String object are built in with method equals



        }
}
