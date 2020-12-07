import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Hourglass {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int sum[] = new int[16];
        int h = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum[h] = sumHourGlass(arr, i, j);
                h++;
            }
        }

        Arrays.sort(sum);
        System.out.println(sum[15]);
        scanner.close();
    }

    public static int sumHourGlass(int[][] arr, int row, int col) {
        int sum = 0;
        for (int r = row; r < row + 3; r++) {
            for (int c = col; c < col + 3; c++) {
                if (r == row + 1 && (c == col || c == col + 2)) {
                    // DON'T ADD TO SUM
                } else {
                    sum += arr[r][c];
                }

            }
        }
        return sum;
    }
}
