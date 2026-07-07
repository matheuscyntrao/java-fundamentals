public class FormattingOutput {

    // You can simply print x to console using System.out.print(x).
    // That command will print x with the maximum number of nonzero digits fot that type.
    static void main() {
        double x = 10000.0 / 3.0;
        System.out.println(x);
        // That is a problema if you want to display dollar and cents
        // After java 5, printf was brought back from C library.
        System.out.printf("%8.2f\n", x); // Eight characters and 2 precision characters
        // You can supply multiple parameters to printf.
        java.lang.String name = "Matheus";
        int age = 34;
        System.out.printf("Hello, %s. Next year you'll be %d\n", name, age);

        // Conversions for printf
        System.out.printf("%d - Decimal Integer\n", 159);
        System.out.printf("%x - Hexadecimal integer\n", 0x9f);
        System.out.printf("%o - Octal integer\n", 0237);
        System.out.printf("%f - Fixed floating-point\n", 15.9f);
        System.out.printf("%e - Exponential floating-point\n", 1.59e+01f);
        System.out.printf("%a - Hexadecimal floating-points\n", 0x1.fccdp3);
        System.out.printf("%s - String\n", "someString");
        System.out.printf("%c - Character\n", 'a');
        System.out.printf("%b - Boolean\n", true);
        System.out.printf("%h - Hash Code\n", "42628b2");
    }
}
