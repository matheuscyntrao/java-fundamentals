import java.math.BigDecimal;

public class DataTypes {

    // Java is strongly typed, every variable must have a type declared.
    // Java has an arbitraty-precision aritchmetic package, but "Big Numbers" os char sequence are Java Objects and not a primitive Java type.

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

    static void main() {

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

    }




}
