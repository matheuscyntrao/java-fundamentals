import java.math.BigDecimal;

public class DataTypes {

    // Java is strongly typed, every variable must have a type declared.
    // Java has an arbitrary-precision arithmetic package, but "Big Numbers" os char sequence are Java Objects and not a primitive Java type.

    // Integer type

    int fourBytes;
    short twoBytes; // Are mainlyintended for specialized applications, such as low-levelfile handling or for large arrays when storage space it at a premium.
    long eightBytes;
    byte oneByte;

    // The ranges of integer type and the main reason for that decision, is to facilitate major pain for developers who want to migrate the system between platforms.
    // Integer types do not depend on the machine witch you be running Java code, here are other difference between Java and C/C++ (they yse the most efficient integer type for each processor, causing overflow if one one 32 bit program runs into 16 bit system.
    // After Java 7, you can write binary integers using prefix 0B or 0b. And also can use underscore (for human eyes) to denote one million, etc

    // Float-Point types

    float floatFourBytes; // (6-7 significant decimal digits) use that just if the library requires or when you need to store a very large number of them; Float types have a suffix 3.14F or 3.14f.
    double floatEightBytes; // (15 significant decimal digits) double have twice precision than float numbers, floating-point numer without f/F, are considered as double. You can also use the suffix 3.14D or 3.14d.

    // You can specify floating-point literals in hexadecimal. 0.125 x 2³ can be written as 0x1.0p-3.
    // In hexadecimal, you use p not an e, to denote the exponent. The base of the exponent is 2, not 10

    /*
        IEEE 754 is the standard that defines:

        How float and double are stored.
        How arithmetic operations are performed.
        Rounding behavior.
        Special values like Infinity and NaN.
        Consistent floating-point computation across systems.

        Understanding IEEE 754 helps explain why floating-point calculations sometimes produce results that look unexpected.
     */

    static void main(String[] args) {

        double x = 1.0 / 0.0;
        System.out.println(x);

        double y = -1.0 / 0.0;
        System.out.println(y);

        double z = 0.0 / 0.0;
        System.out.println(z);

        double value = Math.sqrt(-1);

        if (Double.isNaN(z)) {
            System.out.println("Not a Number");
        }

        if (Double.NaN == z) {
            System.out.println("Not a Number");
        }

        if (Double.POSITIVE_INFINITY == x) {
            System.out.println(Double.POSITIVE_INFINITY);
        }

        if(Double.NEGATIVE_INFINITY == y) {
            System.out.println(Double.NEGATIVE_INFINITY);
        }

        strictfp class Calculator {
            static double calculate() {
                return 10.0 / 3.0;
            }
        }

        System.out.println(Calculator.calculate());
        System.out.println(2.0 - 1.1); // It is represented in the binary number system. There is no precise binary representation of the fraction 1/10.
        BigDecimal bigDecimal = BigDecimal.valueOf((2.0 - 1.1)); // If you do that, you will get an error as well.
        System.out.println(bigDecimal);

        BigDecimal a = BigDecimal.valueOf(2.0); // You need to separate the values before operates any math.
        BigDecimal b = BigDecimal.valueOf(1.1);

        BigDecimal result = a.subtract(b);

        System.out.println(result);

        // The char type
        // Unicode characters or individual characters are represented by a char. Some unicodes need two chat values to be represented.
        // They are enclosed by single quotes. 'A' is diffent "A".
        // They also can be expressed by hexadecimal values starting from \u0000 to \uffff.
        for (int i = 0x0000; i <= 0xFFFF; i++) {
            String hexExpr = String.format("\\u%04X", i);
            char caractere = (char) i;
            if (Character.isISOControl(caractere)) {
                System.out.println(hexExpr + " -> [Caractere de Controle / Invisível]");
            } else {
                System.out.println(hexExpr + " -> " + caractere);
            }
        }

        // Unicode escape sequences are processed before the code is pased.
        // For example "\u0022+\u0022" is not a string consisting of a plus sign. Intead, are converted into '+' = "

        // Backspace \u0008
        // Tab \u0009
        // Linefeed \u000a
        // Carriage return \u000d
        // Double quote \u0022
        // Single quote \u0027
        // Backslash \u005c

        // Complementing studying of Unicode Encoding Scheme
        /*
            ASCII
            ISO 8859-1 Western European
            KOI-8 for Russian
            GB18030 and BIG-5 for Chinese
            etc...

            Almost 65,536 code values.
            Java uses 16-bit Unicode Characters (double as some other languages), today is not enought anymore because the growing of Chinese, Japanese and Korean.
            In Java 5 introduces code point as a code value that is associated with a characted in an encoding scheme.
            U+0041 -> group 17 code planes
            basic multilingual plane, code U+10000 to U+10FFFF, hold the supplementary characters.

            UTF-16 encoding represents all Unicode code points in a variale-length code.
            Code Units -> each of the values in such an encoding pair falls into a range of 2048 unused values of the basic multilingual plane (sorrogates area (U+D800 to U+DBFF for the first, U+DC00 to U+DFFF for the second code unit)).

            https://math.ucr.edu/home/baez/octonions
            https://tools.ietf.org/html/rfc2781 for a description of the encoding alrorithm

         */

    }

    // Boolean Type
    // You cannot convert integers to boolean types, another difference from C++
    boolean x = true;
    boolean y = false;



}
