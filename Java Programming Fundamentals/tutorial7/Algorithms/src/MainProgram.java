import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = { -1, 6, 9, 8, 12 };
        System.out.println("Smallest: " + MainProgram.smallest(numbers));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

        int[] numbers2 = { 3, 2, 5, 4, 8 };

        System.out.println(Arrays.toString(numbers2));

        MainProgram.swap(numbers2, 1, 0);
        System.out.println(Arrays.toString(numbers2));

        MainProgram.swap(numbers2, 0, 3);
        System.out.println(Arrays.toString(numbers2));

    }
    public static void selectionSort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0 ; i < array.length; i ++) {
            swap(array, indexOfSmallestFrom(array, i), i);
            System.out.println(Arrays.toString(array));
        }
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int element : array) {
            if (element < smallest)
                smallest = element;
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (smallest == array[i])
                return i;
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int[] arrayUsed = copy(array, startIndex);
        return indexOfSmallest(arrayUsed) + startIndex;
    }

    public static int[] copy(int[] array, int startIndex) {
        int[] result = new int[array.length - startIndex];
        for (int i = startIndex; i < array.length; i++) {
            result[i - startIndex] = array[i];
        }
        return result;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
