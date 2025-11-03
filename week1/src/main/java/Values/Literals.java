package Values;

public class Literals {

    public static void main(String[] args) {

        // The number 26, in decimal
        int decimalValue = 26;

        //  The number 26, in hexadecimal
        int hexadecimalValue = 0x1a;

        // The number 26, in binary
        int binaryValue = 0b11010;

        System.out.println(decimalValue);
        System.out.println(hexadecimalValue);
        System.out.println(binaryValue);


        int x6 = 0x5_2;
// Invalid: cannot put underscores
// at the end of a number
        int x7 = 0x52;

        System.out.println(x6);
        System.out.println(x7);
    }
}
