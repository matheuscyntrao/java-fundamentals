// Byte -> Short without information loss
// Short -> Int without information loss
// Char -> Int without information loss
// Int -> Float may loose precision
// Int -> Double without information loss
// Int -> Long without information loss
// Long -> Double may loose precision
// Long -> Float may loose precision  123456789 -> has more digits than float can represent
// Float -> Double without information loss

int n = 123456789;
        float f = n;

        void main() {

            int x = 1;
            float y = 1.0f;
            double z = 1.0;

            IO.println("=== Values ===");
            IO.println("x = " + x);
            IO.println("y = " + y);
            IO.println("z = " + z);

            IO.println("\n=== Binary Numeric Promotion ===");

            // int + float -> float
            float result1 = x + y;
            IO.println("x + y = " + result1);

            // float + double -> double
            double result2 = y + z;
            IO.println("y + z = " + result2);

            // int + double -> double
            double result3 = x + z;
            IO.println("x + z = " + result3);

            // ((x + y) + z)
            // int + float -> float
            // float + double -> double
            double result4 = x + y + z;
            IO.println("x + y + z = " + result4);

            IO.println("\n=== Promotion Rules ===");

            byte b = 10;
            short s = 20;
            char c = 30;

            // byte, short and char are promoted to int
            int r1 = b + s;
            int r2 = b + c;
            int r3 = s + c;

            IO.println("byte + short -> int");
            IO.println("byte + char  -> int");
            IO.println("short + char -> int");

            IO.println("\n=== Type Hierarchy ===");

            IO.println("byte -> short -> int -> long -> float -> double");

            long l = 100L;
            float f = 2.5f;
            double d = 3.5;

            IO.println("int + long   -> long");
            IO.println("long + float -> float");
            IO.println("float + double -> double");

            IO.println("\n=== Precision Loss Example ===");

            long big = 16_777_217L; // 2^24 + 1

            float converted = big;

            IO.println("long  = " + big);
            IO.println("float = " + converted);

            IO.println("\n=== Explicit Cast ===");

            double pi = 3.14159;

            int truncated = (int) pi;

            IO.println("double = " + pi);
            IO.println("int    = " + truncated);
        }
