import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(4);
        list.add(7);
        list.add(2);
        list.add(6);
        list.add(12);
        // Strem Methods
        ArrayList<Integer> transformed = list.stream()
                                                .filter(value -> value > 5)
                                                    .map(value -> value * 2)
                                                        .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("== VALUES ==");
        System.out.println(list);
        System.out.println("size: " + list.stream().count());
        // reduce -- accumulate
        int sumOfList = list.stream()
                                .reduce(0, (previous, value) -> previous + value);
        System.out.println(sumOfList);
        System.out.println("== TRANSFORMED ==");
        System.out.println(transformed);
        System.out.println("size: " + transformed.stream().count());
        System.out.println(transformed.stream()
                                        .reduce(0, (previous, value) -> previous + value));

        ArrayList<String> words = new ArrayList<>();
        words.add("First");
        words.add("Second");
        words.add("Third");
        words.add("Fourth");
        words.add("Fifth");

        String combined = words.stream().reduce("", (prev, word) -> prev + word + "\n");
        System.out.println(combined);

       

   


    }
    
}
