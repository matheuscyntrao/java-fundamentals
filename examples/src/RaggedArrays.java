import java.util.Arrays;

public class RaggedArrays {

    // So far, what you have seen is not too different from other programming languages.
    // Java has no multidimensional arrays at all, only one-dimensional (arrays of arrays)
    // Only refers to the other array
    static void main() {

        double[][] balances = new double[][] { { 123.12, 123.13, 123.14 }, { 123.12, 123.13, 123.14 }, { 123.12, 123.13, 123.14 }};
        for(int i = 0; i < balances.length - 1; i++) {
            double[] temp = new double[]{balances[0][i]};
            balances[i] = balances[i +1];
            balances[i + 1] = temp;
        }

        System.out.println(Arrays.deepToString(balances));

        int[][] odds  = new int[60 + 1][];

        for(int n = 0; n < 61; n++) {
            odds[n] = new int [n + 1];
        }

        System.out.println(Arrays.deepToString(odds));

        for(int n = 0; n < odds.length; n++) {
            for(int k = 0; k < odds[n].length; k++) {
                odds[n][k] = n + k;
            }
        }

        System.out.println(Arrays.deepToString(odds));

    }

}
