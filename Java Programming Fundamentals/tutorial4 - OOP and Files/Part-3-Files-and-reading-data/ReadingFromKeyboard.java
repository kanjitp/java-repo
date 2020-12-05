import java.util.*;

public class ReadingFromKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String line = sc.nextLine();

            if (line.equals("end"))
                break;
            
            int number = Integer.valueOf(line);
            System.out.println(number);

        }
        sc.close();
    }

}
