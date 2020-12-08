public class Main {
    public static void main(String[] args) {
        Locker<String> string = new Locker<>();
        string.setValue(":)");

        System.out.println(string.getValue());

        Info<String, Integer> i1 = new Info<>("Pow", 3);
        Info<Object, Object> i2 = new Info<>("Hey", i1);

        System.out.println(i1);
        System.out.println(i2);
    }
}
