import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("factorial: ");
        int n = Integer.valueOf(sc.nextLine());
        System.out.println("= " + Calculator.factorial(n));
        System.out.println();
        System.out.print("binomial coefficient: \n");
        System.out.print("Set Size: ");
        int m = Integer.valueOf(sc.nextLine());
        System.out.print("Subset Size: ");
        int r = Integer.valueOf(sc.nextLine());
        System.out.println("= " + Calculator.binomialCoefficient(m, r));
    }
    
}
