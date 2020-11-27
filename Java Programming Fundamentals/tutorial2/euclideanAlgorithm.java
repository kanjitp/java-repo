import java.util.*;
public class euclideanAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\na: ");
        int a = sc.nextInt();
        System.out.printf("\nb: ");
        int b = sc.nextInt();
        System.out.println();
        gcdExtended(a, b);
        bezoutLemma(a, b);
    }

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    public static void gcdExtended(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        int r = b;

        System.out.println("-- Applying Euclidean Algorithm");
        while (r != 0) {
            int closestMultiple = (int) Math.floor(a / b);
            r = a - b * closestMultiple;
            System.out.printf("%6d = %6d x %6d + %6d \n", a, closestMultiple, b, r);
            a = b;
            b = r;
        }

    }
    public static void bezoutLemma(int a, int b) {
        System.out.println("-- Applying Reverse Euclidean Algorithm");
        int r1 = a;
        int r2 = b;
        int u1 = 1;
        int v1 = 0;
        int u2 = 0;
        int v2 = 1;

        while (r2 != 0) {
            int quotient = (int) r1 / r2;
            int rs = r1;
            int us = u1;
            int vs = v1;
            r1 = r2;
            u1 = u2;
            v1 = v2;
            r2 = rs - quotient * r2;
            u2 = us - quotient * u2;
            v2 = vs - quotient * v2;
        }
        System.out.printf("%6d = %6d x %6d + %6d x %6d ", r1, u1, a, v1, b);

    }
}
