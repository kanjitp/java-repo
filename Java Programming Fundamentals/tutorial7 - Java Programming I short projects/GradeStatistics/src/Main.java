import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> record = new ArrayList<>();
        System.out.println("Enter point totals, -1 stops:");
        int counter = 0, counterPassing = 0;
        int sum = 0, sumPassing = 0;
        while (true) {
            int input = scan.nextInt();
            if (input == -1)
                break;
            if (input < 0 || input > 100)
                continue;
            if (input > 50) {
                counterPassing++;
                sumPassing += input;
            }
            counter++;
            sum += input;
            record.add(input);
        }
        System.out.println("Point average (all): " + sum / (double) counter);
        System.out.println(
                "Point average (passing): " + ((counterPassing > 0) ? sumPassing / (double) counterPassing : "-"));
        System.out.println("Pass percentage: " + counterPassing / (double) counter * 100);
        System.out.println("Grade distribution:");
        int[] grades = new int[6]; // 0 1 2 3 4 5
        for (int scores : record) {
            if (scores < 50) {
                grades[0] ++;
            } else if (scores < 60) {
                grades[1] ++;
            } else if (scores < 70) {
                grades[2] ++;
            } else if (scores < 80) {
                grades[3] ++;
            } else if (scores < 90) {
                grades[4] ++;
            } else {
                grades[5] ++;
            }
        }
        for (int i = 5; i >= 0; i--) {
            String stars = "";
            for (int j = 0; j < grades[i]; j ++) {
                stars += "*";
            }
            System.out.println(i + ": " + stars);
        }
    }

}
