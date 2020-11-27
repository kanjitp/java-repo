public class Whistle {
    
    private String sound;

    public Whistle() {
        this.sound = "";
    }

    public Whistle(String sound) {
        this.sound = sound;
        // sound on the RHS refers to the parameter
        // sound on the LHS refers to the property due to dot operator
    }

    public void makeSound() {
        System.out.println(this.sound);
    }

}
