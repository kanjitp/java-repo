import java.util.*;

public class lastTwoDigit {
    public static void main(String[] args) {
        int n = 50;
        Set<Integer> hash_Set 
            = new HashSet<Integer>(); 
        for (int i = 0; i < n; i ++) {
            int lastTwo = (int)(Math.pow(2, i) % 100);
            System.out.println(lastTwo);
            hash_Set.add(lastTwo);
        }
        System.out.println(hash_Set.size());
    }
    
}
