import java.util.Arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int[][] twoDimensionalArray = new int[rows][columns];

        for (int row = 0; row < twoDimensionalArray.length; row++) {
            for (int column = 0; column < twoDimensionalArray[row].length; column++) {
                System.out.print(twoDimensionalArray[row][column] + " ");
            }
            System.out.println();
        }

        int[][] matrix = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };

        System.out.println(arrayAsString(matrix));
    }
    public static String arrayAsString(int[][] matrix) {
        int rows = matrix.length;
        String s = "";
        for (int i = 0; i < rows; i++) {
            s += Arrays.toString(matrix[i]) + "\n";
        }
        return s;
    }

}
