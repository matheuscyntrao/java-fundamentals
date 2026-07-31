package modulo_1;

import java.lang.String;
public class RelationalAndBooleanOperators {

    static void main() {

        if (3==7) {
            System.out.println("Equality of Numbers");
        }

        if(3!=7) {
            System.out.println("Inequality of Numbers");
        }

        if(3 == 7 && 3 != 7) {
            System.out.println("And operator");
        }

        if(3 == 7 || 3!=7) {
            System.out.println("Or operator");
        }

        if(3 != 7 || 3 ==7) {
            System.out.println("The second experssion is never reached");
        }

        // Ternary expressions

        int age = 18;

        String status = age >= 18 ? "Adult" : "Minor";

        System.out.println(status);

        // Bitwise operators

        // Work directly with the individual bits that make up integer values.
        // They are commonly used for flags, masks, permissions, low-level programming,
        // performance optimizations, and binary data manipulation.

        int a = 5;  // 0101
        int b = 3;  // 0011

        // AND (&)
        // Result bit is 1 only if both bits are 1
        System.out.println(a & b); // 0001 = 1

        // OR (|)
        // Result bit is 1 if either bit is 1
        System.out.println(a | b); // 0111 = 7

        // XOR (^)
        // Result bit is 1 if bits are different
        System.out.println(a ^ b); // 0110 = 6

        // NOT (~)
        // Inverts all bits
        System.out.println(~a);    // -6

        // Left Shift (<<)
        // Shifts bits to the left, filling with zeros on the right
        System.out.println(a << 1); // 1010 = 10

        // Signed Right Shift (>>
        // Shifts bits to the right, preserving the sign bit
        System.out.println(a >> 1); // 0010 = 2

        // Unsigned Right Shift (>>>)
        // Shifts bits to the right, filling with zeros on the left
        System.out.println(a >>> 1); // 0010 = 2

        System.out.println(Integer.toBinaryString(5)); // 101
        System.out.println(Integer.toBinaryString(3)); // 11


        int fourthBitFromRight = (10 & 0b1000) / 0b1000;
        int fourthBitFromRight_ = (100 & 0b0100) / 0b0100;
        int fourthBitFromRight_1 = (10 & (1<< 3)) >> 3;

        // When applied to boolean values, are probably operators to short circuit

        System.out.println(fourthBitFromRight + " | " + fourthBitFromRight_ + "| " + fourthBitFromRight_1);

        System.out.println(1 << 35);
        System.out.println(1 << 3);
        System.out.println(8);
        System.out.println(1 >>> 0);
        System.out.println(1 >>> 1);
        System.out.println(1 >>> 2);
        System.out.println(1 >>> 3);

    }

}
