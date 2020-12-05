public class CustomTacoBox implements Tacobox{

    private int tacos;

    public CustomTacoBox (int numberOfTacos) {
        this.tacos = numberOfTacos;
    }

    public int tacosRemaining() {
        return this.tacos;
    }
    public void eat() {
        if (tacos > 0) tacos --;
    }


    
}