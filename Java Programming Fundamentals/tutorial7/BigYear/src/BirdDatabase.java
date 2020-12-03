import java.util.*;

public class BirdDatabase {

    private ArrayList<Bird> birds;
    private ArrayList<Integer> counts;

    public BirdDatabase() {
        this.birds = new ArrayList<>();
        this.counts = new ArrayList<>();
    }
    public void add(Bird bird) {
        if (!birds.contains(bird)) {
            birds.add(bird);
            counts.add(0);
        }
    }
    public boolean contains(String birdName) {
        for (Bird bird : birds) {
            if (bird.getName().equals(birdName)) return true;
        }
        return false;
    }
    public int indexOf(String birdName) {
            int counter = 0;
            for (Bird bird : birds) {
                if (bird.getName().equals(birdName)) return counter;
                counter ++;
            }
            return -1;
    }
    public boolean observation(String birdName) {
        if (this.contains(birdName)) {
            int birdIndex = this.indexOf(birdName);
            counts.set(birdIndex, counts.get(birdIndex) + 1);
            return true;
        }
        return false;
    }
    public int getCount(Bird bird) {
        return counts.get(this.indexOf(bird.getName()));
    }
    public void printOne(String birdName) {
        Bird bird = birds.get(this.indexOf(birdName));
        if (this.contains(birdName)) {
            System.out.println(bird + ": " + getCount(bird) + " observations \n");
        }
    }
    @Override
    public String toString() {
        String result = "\nCURRENT OBSERVATIONS:\n";
        for (Bird bird : birds) {
            result += bird + ": " + getCount(bird) + " observations \n"; 
        }
        return result;
    }
    
    
}
