import java.util.Scanner;

public class MagicSquareMain {
    public static void main(String[] args) {

        System.out.print("Magic square of size: ");
        MagicSquare matrix = MagicSquareFactory.createMagicSquare(Integer.parseInt(new Scanner(System.in).nextLine()));

        System.out.println(TwoDimensionalArray.arrayAsString(matrix.square()));
        System.out.println("Sum of rows: " + matrix.sumOfRows());
        System.out.println("Sum of columns: " + matrix.sumOfColumns());
        System.out.println("Sum of diagonals: " + matrix.sumOfDiagonals()); 
        System.out.println("MagicSquare: " + MagicSquare.isMagicSquare(matrix));
    }
    
}
