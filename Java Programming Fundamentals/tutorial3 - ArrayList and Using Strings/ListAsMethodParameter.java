import java.util.*;

public class ListAsMethodParameter {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println("--ArrayList<Integer> list--");
        print(list);

        removeFirst(list);
        removeFirst(list);
        System.out.println("--removeFirst 2 times");
        print(list);

        removeLast(list);
        removeLast(list);
        System.out.println("--removeLast 2 times");
        print(list);

        emptyList(list);
        System.out.println("--empytyList");
        print(list);

    }

    private static void print(ArrayList<Integer> numbers) {
        for (int value : numbers) {
            System.out.println(value);
        }
    }

    private static void removeFirst(ArrayList<Integer> numbers) {
        if (numbers.size() == 0) {
            return;
        }

        numbers.remove(0);
    }

    private static void removeLast(ArrayList<Integer> numbers) {
        if (numbers.size() == 0)
            return;
        numbers.remove(numbers.size() - 1);
    }

    private static void emptyList(ArrayList<Integer> numbers) {
        while (numbers.size() != 0) {
            removeFirst(numbers);
        }
    }
}