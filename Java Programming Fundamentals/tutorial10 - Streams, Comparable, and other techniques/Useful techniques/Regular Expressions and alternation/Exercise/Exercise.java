import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter day of week: ");
        String day = sc.nextLine();
        if (isDayOfWeek(day)) {
            System.out.println("correct!");
        } else {
            System.out.println("incorrect!");
        }
        System.out.print("enter only vowels: ");
        String vowels = sc.nextLine();
        if (allVowels(vowels)) {
            System.out.println("correct!");
        } else {
            System.out.println("inorrect!");
        }
        System.out.print("print time of the day: HH:MM:SS ");
        String time = sc.nextLine();
        if (timeOfDay(time)) {
            System.out.println("correct!");
        } else {
            System.out.println("incorrect!");
        }

    
    }
    public static boolean isDayOfWeek(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
    public static boolean allVowels(String string) {
        return string.matches("(a|e|i|o|u)+");
    }
    public static boolean timeOfDay(String string) {
        return string.matches("((0[0-9])|(1[0-9])|(2[0-3])):[0-5][0-9]:[0-5][0-9]");
    }
    
}
