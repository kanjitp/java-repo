import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) break;
            inputs.add(row);
        }

        long numberDivisibleByThree = inputs.stream()
                                                .mapToInt(s -> Integer.valueOf(s))
                                                    .filter(number -> number % 3 == 0)
                                                        .count();
        
        double average = inputs.stream()
                                .mapToInt(s -> Integer.valueOf(s))
                                    .average()
                                        .getAsDouble();
        long numberGreaterThanFive = inputs.stream()
                                            .mapToInt(s -> Integer.valueOf(s))
                                                .filter(number -> Screener.greaterThanFive(number))
                                                    .count();
        long numberDivisibleByFive  = inputs.stream()
                                                .mapToInt(s -> {
                                                    return Integer.valueOf(s);
                                                })
                                                    .filter(value -> value % 5 == 0).count();
        System.out.println("Divisible by three " + numberDivisibleByThree);
        System.out.println("Number greater than five " + numberGreaterThanFive);
        System.out.println("Divisible by five " + numberDivisibleByFive);
        System.out.println("Average : " + average);

    }
    
}
