public class MagicSquareFactory {

    public static MagicSquare createMagicSquare(int n) {
        // Using siamese algorithm
        if (n % 2 == 0) throw new IllegalArgumentException();
        int[][] numbers = new int[n][n];
        fill(numbers);
        return new MagicSquare(numbers);
    }

    private static void fill(int[][] numbers) {
        // Siamese Algorithm
        int n = numbers.length;
        int row = 0;
        int col = (int) Math.floor(n / 2.0);
        for (int i = 1; i <= n * n; i ++) {
            while (numbers[row][col] != 0) {
                row = row - 1 < 0 ? n - 1 : row - 1;
                col = col + 1 > n - 1 ? 0 : col + 1;
                if (numbers[row][col] != 0) {
                    row = row + 1 > n - 1 ? 0 : row + 1;
                    col = col - 1 < 0 ? n - 1 : col - 1;
                    row = row + 1 > n - 1 ? 0 : row + 1;
                }
            }
            numbers[row][col] = i;
        } 
    }


    
}
