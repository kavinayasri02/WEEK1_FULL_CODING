public class Datatypes {
public static void main(String args[]){
        // Integer types
        byte myByte = 100;          // 8-bit
        short myShort = 30000;      // 16-bit
        int myInt = 1000000;        // 32-bit
        long myLong = 1000000000L;  // 64-bit (use L suffix)//format specifier

        // Floating point types
        float myFloat = 10.5f;      // 32-bit (use f suffix)//format specifier
        double myDouble = 20.99;    // 64-bit

        // Character type
        char myChar = 'A';          // single character

        // Boolean type
        boolean myBoolean = true;   // true or false

        // Non-primitive type
        String myString = "Hello_Java!";

        // Printing all variables
        System.out.println("Byte value: " + myByte);
        System.out.println("Short value: " + myShort);
        System.out.println("Int value: " + myInt);
        System.out.println("Long value: " + myLong);
        System.out.println("Float value: " + myFloat);
        System.out.println("Double value: " + myDouble);
        System.out.println("Char value: " + myChar);
        System.out.println("Boolean value: " + myBoolean);
        System.out.println("String value: " + myString);
    }
}