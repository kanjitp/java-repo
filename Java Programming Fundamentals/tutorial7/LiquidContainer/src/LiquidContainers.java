public class LiquidContainers {

    private String name;
    private int limit;
    private int volume;

    public LiquidContainers(String name, int lim, int vol) {
        this.name = name;
        this.limit = lim;
        this.volume = vol;
    }
    public LiquidContainers(String name, int lim) {
        this(name, lim, 0);
    }
    // accessor
    public int getVol() {
        return this.volume;
    }
    // methods
    public void add(int amount) {
        if (amount <= 0) return;
        if (this.volume + amount <= this.limit){
            this.volume += amount;
        }
        else {
            this.volume = limit;
        }
    }
    public void remove(int amount) {
        if (amount <= 0) return;
        if (this.volume - amount >= 0) {
            this.volume -= amount;
        } else {
            this.volume = 0;
        }
    }
    public void move(LiquidContainers container, int amount) {
        if (this.volume > amount) {
            this.remove(amount);
            container.add(amount);
        } else {
            move(container);
        }
    }
    public void move(LiquidContainers container) {
        container.add(this.volume);
        this.remove(this.volume);
    }

    @Override
    public String toString() {
        return this.name + ": " + this.volume + "/" + this.limit;
    }
    
}
