

public class dataTypes {
    public static void main(String[] args) {
        String text = "contain text";               // COLLECTION OF CHARS (NOT PRIMITIVE)
        int wholeNumber = 1123;                     //4 bytes
        double floatingPoint = 3.141592653689793;   // 8 bytes
        boolean trueOrFalse = true;                 // 1 bit


        // OTHER LESS USED ONES
        char character = '\u0041';                   // 2 bytes

        byte only8bit = 127;                         // 1 bytes  
        short only16bits = (short)32767;             // 2 bytes
        long longNumber = 9999919199999L;            // 8 bytes (long can be over 2,147,483,647)

        float smallerdetail = 3.14159f;              // 4 bytes




        System.out.println("Text variable: " + text);
        System.out.println("Integer variable: " + wholeNumber);
        System.out.println("Floating-point variable: " + floatingPoint);
        System.out.println("Boolean: " + trueOrFalse);

        int value = 10;
        System.out.println("first value: " + value);
        value = 4;
        System.out.println("value after reassigning: " + value);


    }
}
