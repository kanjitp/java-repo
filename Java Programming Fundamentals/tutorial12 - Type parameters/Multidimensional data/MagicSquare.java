import java.util.ArrayList;

public class MagicSquare {

    private int[][] numbers;
    private int rows;
    private int columns;

    public MagicSquare() {
        this(3);
    }

    public MagicSquare(int[][] matrix) {
        this.numbers = matrix;
        rows = numbers.length;
        columns = rows == 0 ? 0 : numbers[0].length;
    }

    public MagicSquare(int n) {
        if (n < 0) throw new IllegalArgumentException();
        this.numbers = new int[n][n];
        rows = n;
        columns = n;
    }

    public int[][] square() {
        return this.numbers;
    }

    public ArrayList<Integer> sumOfRows() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < rows; i ++) {
            int sum = 0;
            for (int j = 0 ; j < columns; j ++) {
                sum += numbers[i][j];
            }
            list.add(sum);
        }
        return list;
    }

    public ArrayList<Integer> sumOfColumns() {
        ArrayList<Integer> list = new ArrayList<>();
        int[] sumColumns = new int[columns];
        for (int i = 0 ; i < rows; i ++) {
            for (int j = 0; j < columns; j ++) {
                sumColumns[j] += numbers[i][j];
            }
        }
        for (int i : sumColumns) {
            list.add(i);
        }
        return list;
    }

    public ArrayList<Integer> sumOfDiagonals() {
        ArrayList<Integer> list  = new ArrayList<>();
        int[] sumDiagonals = new int[2];
        for (int r = 0; r < rows; r ++) {
            for (int c = 0; c < columns; c ++) {
                if (r == c) sumDiagonals[0] += numbers[r][c];
                if (r == columns - c - 1) sumDiagonals[1] += numbers[r][c];
            }
        }
        list.add(sumDiagonals[0]);
        list.add(sumDiagonals[1]);
        return list;
    }
    public static boolean isMagicSquare(MagicSquare matrix) {
        int sum = matrix.sumOfRows().get(0);
        for (int i : matrix.sumOfRows()) {
            if (sum != i) return false;
        }
        for (int j : matrix.sumOfColumns()) {
            if (sum != j) return false;
        }
        for (int k : matrix.sumOfDiagonals()) {
            if (sum != k) return false;
        }
        return true;
    }



    
}
