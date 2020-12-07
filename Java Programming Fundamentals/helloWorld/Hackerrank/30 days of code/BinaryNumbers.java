import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BinaryNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(countMaxConsecutive(toBinary(n)));
        scanner.close();
    }

    public static String toBinary(int denary) {
        return Integer.toBinaryString(denary);
    }

    public static int countMaxConsecutive(String binaryString) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.substring(i, i + 1).equals("1")) {
                count++;
                if (count > max)
                    max = count;
            } else {
                count = 0;
            }
        }
        return max;
    }
}
