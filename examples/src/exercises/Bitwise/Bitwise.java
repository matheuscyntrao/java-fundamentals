package exercises.Bitwise;

public class Bitwise {

    static void main() {
        int a = 0b1111;
        int b = 0b0101;

        System.out.println("--A--");
        System.out.println(a < 3);
        System.out.println(a << 3);
        System.out.println(a > 3);
        System.out.println(a >> 3);
        System.out.println(a >>> 3);

        System.out.println("--B--");
        System.out.println(b < 3);
        System.out.println(b << 3);
        System.out.println(b > 3);
        System.out.println(b >> 3);
        System.out.println(b >>> 3);

        System.out.println("--BITWISE--");
        System.out.println( a & b );
        System.out.println( a | b );
        System.out.println(String.valueOf(~a));
        System.out.println(String.valueOf(a));
        System.out.println(a ^ b);


    }
}
