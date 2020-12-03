import java.util.*;

public class Main {
    public static void main(String[] args) {
        // USING OUR OWN IMPLEMENTATION THROUGH STATIC METHODS FROM CLASS MainProgram
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println("BEFORE: " + Arrays.toString(numbers));
        MainProgram.selectionSort(numbers);
        System.out.println("AFTER:  " + Arrays.toString(numbers));
        // JAVA BUILT-IN METHOD
        System.out.println("== BUILT-IN JAVA CLASS Arrays methods ==");
        int[] numbers2 = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers2));
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

    }
    
}
