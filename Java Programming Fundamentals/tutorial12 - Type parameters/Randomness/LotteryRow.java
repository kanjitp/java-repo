import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number){
        for (int n : numbers) {
            if (n == number) return true;
        }
        return false;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0 ; i < 7; i ++) {
            numbers.add(rand.nextInt(40) + 1);
        }
    }
    
}
