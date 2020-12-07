public class Calculator {
    
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial cannot work with negative number");
        }
        return n == 0 
            ? 1
            : n * factorial(n - 1);
    }

    public static int binomialCoefficient(int setSize, int subsetSize) {
        if (setSize < 0 || subsetSize < 0) {
            throw new IllegalArgumentException("set size and subset size need to be non-negative");
        }
        if (subsetSize > setSize) {
            throw new IllegalArgumentException("subset size need to be smaller than set size");
        }
        return factorial(setSize) / (factorial(setSize - subsetSize) * factorial(subsetSize));
    }

}
