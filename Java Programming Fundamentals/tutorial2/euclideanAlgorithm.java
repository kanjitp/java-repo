public class euclideanAlgorithm {
    public static void main(String[] args) {
        gcdExtended(12327, 2409);
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
}
