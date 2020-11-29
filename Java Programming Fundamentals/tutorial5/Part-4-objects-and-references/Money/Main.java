public class Main {
    public static void main(String[] args) {
        Money a = new Money(10, 69);
        Money b = new Money(5, 32);

        Money c = a.plus(b);

        System.out.println(a); // 10.69e
        System.out.println(b); // 5.32e
        System.out.println(c); // 16.01e

        a = a.plus(c); 

        System.out.println(a); // 26.70e
        System.out.println(b); // 5.32e
        System.out.println(c); // 16.01e

        System.out.println(a.lessThan(b)); // false
        System.out.println(b.lessThan(c)); // true

        c = c.minus(b); 
        Money d = c.minus(a);

        System.out.println(a); // 26.70e
        System.out.println(b); // 5.32e
        System.out.println(c); // 10.69e
        System.out.println(d); // -16.01e
    }
}
