import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        for (Suitcase existingSuitcase : suitcases) {
            totalWeight += existingSuitcase.totalWeight();
        }
        if (suitcase.totalWeight() <= maximumWeight - totalWeight)
            this.suitcases.add(suitcase);
    }
    public void printItems() {
         for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
         }
    }
    @Override
    public String toString() {
        int counter = 0;
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
            counter ++;
        }
        return  counter + " suitcases (" + totalWeight + " kg)";
    }


    
}
