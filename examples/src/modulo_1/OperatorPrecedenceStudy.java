package modulo_1;

public class OperatorPrecedenceStudy {

    public static void main(String[] args) {

        /*
         * ============================================================
         * OPERATOR PRECEDENCE IN JAVA
         * ============================================================
         *
         * Java evaluates expressions according to a precedence hierarchy.
         *
         * Highest Priority
         * ------------------------------------------------------------
         * () [] .
         * Unary: ! ~ ++ -- + - (cast)
         * * / %
         * + -
         * << >> >>>
         * < <= > >= instanceof
         * == !=
         * &
         * ^
         * |
         * &&
         * ||
         * ?:
         * = += -= *= /= ...
         * ------------------------------------------------------------
         * Lowest Priority
         *
         * When in doubt, use parentheses.
         */

        System.out.println("=== 1. Parentheses Override Everything ===");

        // Multiplication has higher precedence than addition.
        // Equivalent to: 2 + (3 * 4)
        System.out.println("2 + 3 * 4 = " + (2 + 3 * 4));

        // Parentheses force addition first.
        // Equivalent to: (2 + 3) * 4
        System.out.println("(2 + 3) * 4 = " + ((2 + 3) * 4));


        System.out.println("\n=== 2. Unary Operators ===");

        int x = 5;

        // Unary minus has higher precedence than multiplication.
        // Equivalent to: (-5) * 2
        System.out.println("-x * 2 = " + (-x * 2));

        x = 5;

        // Prefix increment executes BEFORE evaluation.
        // x becomes 6, then multiplication occurs.
        System.out.println("++x * 2 = " + (++x * 2));

        x = 5;

        // Postfix increment executes AFTER evaluation.
        // 5 * 2 = 10
        // Then x becomes 6
        System.out.println("x++ * 2 = " + (x++ * 2));
        System.out.println("x after x++ = " + x);


        System.out.println("\n=== 3. modulo_1.Casts ===");

        // Explicit cast converts 5 into a double BEFORE division.
        // double / int -> double
        System.out.println("(double)5 / 2 = " + ((double) 5 / 2));

        // Integer division.
        // Fractional part is discarded.
        System.out.println("5 / 2 = " + (5 / 2));


        System.out.println("\n=== 4. Multiplication Before Addition ===");

        // Equivalent to: 10 + (2 * 3)
        System.out.println("10 + 2 * 3 = " + (10 + 2 * 3));

        // Equivalent to: 10 - (6 / 2)
        System.out.println("10 - 6 / 2 = " + (10 - 6 / 2));


        System.out.println("\n=== 5. Addition Before Shifts ===");

        /*
         * Shift operators have LOWER precedence than + and -.
         *
         * Equivalent to:
         * (2 + 1) << 2
         *
         * 3 << 2
         *
         * Binary:
         * 0011 -> 1100
         *
         * Result = 12
         */
        System.out.println("2 + 1 << 2 = " + (2 + 1 << 2));

        /*
         * Equivalent to:
         * 8 >> (1 + 1)
         *
         * 8 >> 2
         *
         * Binary:
         * 1000 -> 0010
         *
         * Result = 2
         */
        System.out.println("8 >> 1 + 1 = " + (8 >> 1 + 1));


        System.out.println("\n=== 6. Relational After Shifts ===");

        /*
         * Equivalent to:
         * (1 << 3) > 5
         *
         * 8 > 5
         */
        System.out.println("1 << 3 > 5 = " + (1 << 3 > 5));


        System.out.println("\n=== 7. Equality After Relational ===");

        /*
         * Relational operators execute first.
         *
         * (5 > 3) == true
         *
         * true == true
         */
        System.out.println("5 > 3 == true = " + (5 > 3 == true));

        /*
         * (5 < 3) == false
         *
         * false == false
         */
        System.out.println("5 < 3 == false = " + (5 < 3 == false));


        System.out.println("\n=== 8. Bitwise Operators ===");

        /*
         * Bitwise precedence:
         *
         * &
         * ^
         * |
         *
         * AND executes before XOR.
         *
         * 12 = 1100
         * 10 = 1010
         *
         * 1100 & 1010 = 1000 (8)
         * 1000 ^ 0011 = 1011 (11)
         */
        int bitwise1 = 12 & 10 ^ 3;
        System.out.println("12 & 10 ^ 3 = " + bitwise1);

        /*
         * AND executes before OR.
         *
         * 2 & 4 = 0
         * 1 | 0 = 1
         */
        int bitwise2 = 1 | 2 & 4;
        System.out.println("1 | 2 & 4 = " + bitwise2);


        System.out.println("\n=== 9. Logical AND Before OR ===");

        /*
         * Logical precedence:
         *
         * &&
         * ||
         *
         * false && false = false
         * true || false = true
         */
        boolean logical1 = true || false && false;
        System.out.println("true || false && false = " + logical1);

        boolean logical2 = false || true && true;
        System.out.println("false || true && true = " + logical2);


        System.out.println("\n=== 10. Ternary Operator ===");

        /*
         * || executes before ?:
         *
         * (true || false)
         * ? 10
         * : 20
         */
        int ternary1 = true || false ? 10 : 20;
        System.out.println("true || false ? 10 : 20 = " + ternary1);

        int ternary2 = false && true ? 10 : 20;
        System.out.println("false && true ? 10 : 20 = " + ternary2);


        System.out.println("\n=== 11. Assignment ===");

        /*
         * Assignment has very low precedence.
         *
         * Equivalent to:
         * result = (2 + (3 * 4))
         */
        int result = 2 + 3 * 4;
        System.out.println("result = 2 + 3 * 4 -> " + result);

        /*
         * Compound assignment.
         *
         * Equivalent to:
         * y = y + (2 * 3)
         */
        int y = 5;
        y += 2 * 3;
        System.out.println("y += 2 * 3 -> " + y);


        System.out.println("\n=== Numeric Promotion ===");

        /*
         * Numeric promotion rules:
         *
         * double
         * float
         * long
         * int
         *
         * Smaller types are promoted automatically.
         */

        int a = 1;
        float b = 1.0f;
        double c = 1.0;

        // int + float -> float
        // float + double -> double
        System.out.println("a + b + c = " + (a + b + c));

        // int promoted to float
        System.out.println("a + b = " + (a + b));

        // float promoted to double
        System.out.println("b + c = " + (b + c));

        // int promoted to double
        System.out.println("a + c = " + (a + c));


        System.out.println("\n=== byte/short/char Promotion ===");

        byte by = 10;
        short sh = 20;
        char ch = 30;

        /*
         * Java promotes byte, short and char to int
         * before arithmetic operations.
         */

        System.out.println("byte + short = " + (by + sh));
        System.out.println("byte + char = " + (by + ch));
        System.out.println("short + char = " + (sh + ch));


        System.out.println("\n=== Ultimate Challenges ===");

        /*
         * Step 1:
         * 3 * 4 = 12
         *
         * Step 2:
         * 2 + 12 = 14
         *
         * Step 3:
         * 14 > 10 = true
         *
         * Step 4:
         * 5 < 10 = true
         *
         * Step 5:
         * true && true = true
         */
        System.out.println(
                "2 + 3 * 4 > 10 && 5 < 10 = "
                        + (2 + 3 * 4 > 10 && 5 < 10));

        /*
         * (1 + 2) << 2
         *
         * 3 << 2
         *
         * 12 == 12
         */
        System.out.println(
                "1 + 2 << 2 == 12 = "
                        + (1 + 2 << 2 == 12));

        /*
         * true || (false && false)
         *
         * true || false
         *
         * true ? 1 : 2
         */
        System.out.println(
                "true || false && false ? 1 : 2 = "
                        + (true || false && false ? 1 : 2));


        System.out.println("\n=== Bonus: Binary Visualization ===");

        int n1 = 12;
        int n2 = 10;

        System.out.println("12 in binary = " + Integer.toBinaryString(n1));
        System.out.println("10 in binary = " + Integer.toBinaryString(n2));

        /*
         * 1100 & 1010
         * = 1000
         */
        System.out.println("12 & 10 = " + (n1 & n2));

        /*
         * 1100 | 1010
         * = 1110
         */
        System.out.println("12 | 10 = " + (n1 | n2));

        /*
         * 1100 ^ 1010
         * = 0110
         */
        System.out.println("12 ^ 10 = " + (n1 ^ n2));
    }
}