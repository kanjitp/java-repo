public class Array {
    public static void main(String[] args) {
        // Creating Array
        /*
         * There are two ways to create an Array. In the first one you have to
         * explicitly define the size upon the creating.
         */
        int[] numbers = new int[3];
        String[] strings = new String[5];

        // Assigning and accessing elements

        numbers[0] = 2;
        numbers[2] = 5;

        System.out.println(numbers); // [I@2f0e140b
        System.out.println(numbers[0]); // 2
        System.out.println(numbers[2]); // 5
        System.out.println(numbers.length); // 3

        listElements(numbers);
        // note that numbers[1] = 0 due to default value allocation

        System.out.println(sumOfArray(numbers));

        // shorter way to create an array
        String[] order = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh"};
        char[] aToG = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        for (int i = 0; i < aToG.length; i++) {
            System.out.println("The " + order[i] + " alphabet -- " + aToG[i]);
        }

    }

    public static void listElements(int[] integerArray) {
        // it is currently impossible to access the name of the array as in java
        // the name of the array is not communicated. Just the memory address.
        System.out.println("-- integerArray " + integerArray);
        int index = 0;
        while (index < integerArray.length) {
            int number = integerArray[index];
            System.out.println(number + " ");
            index++;
        }
        System.out.println("");

    }

    public static int sumOfArray(int[] integerArray) {
        int result = 0;
        int index = 0;
        while (index < integerArray.length) {
            result += integerArray[index];
            index++;
        }
        return result;
    }
}
