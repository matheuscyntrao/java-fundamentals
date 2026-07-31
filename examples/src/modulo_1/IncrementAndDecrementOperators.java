package modulo_1;

public class IncrementAndDecrementOperators {

    static void main() {
        int n = 12;
        n++;

        int m = 7;
        int o = 7;
        int a = 2 * ++m; // It is not a Java best practice because leads confusing code, but it works.
        int b = 2 * o++;

        System.out.println(a + "/" + b);

        System.out.println(a + --m);
        System.out.println(b + o--);
    }

}
