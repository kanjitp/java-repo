import java.util.Random;
import java.util.Scanner;

public class Raffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("How many random numbers should be printed? ");
        System.out.print("> ");

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n ; i ++) {
            System.out.println(rand.nextInt(10));
        }
    }
    
}
