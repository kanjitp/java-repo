public class TripleTacoBox implements Tacobox{

    private int tacos;

    public TripleTacoBox() {
        this.tacos = 3;
    }

    public int tacosRemaining() {
        return this.tacos;
    }

    public void eat() {
        if (tacos > 0) tacos --;
    }

    
}
