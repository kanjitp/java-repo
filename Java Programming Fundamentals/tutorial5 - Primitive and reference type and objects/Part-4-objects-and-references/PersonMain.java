
public class PersonMain {
    public static void main(String[] args) {
        Person joan = new Person("Jaon Ball");
        System.out.println(joan);

        Person ball = joan;
        ball.growOlder();
        ball.growOlder();

        // Value of joan also changes because ball and joan refers to the same object
        System.out.println(joan);

        joan = new Person("Joan B.");
        System.out.println(joan);

        ball = null;
        // null refers to "nothing" - ball is referenced to nothing in this case
        System.out.println(ball);
    }
    
}
