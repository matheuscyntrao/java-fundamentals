package modulo_1;

public class MultidimensionalArray {

    // Use more than one index to access array elements.
    // Used for tables and other more complex arrangements.

    // Like investiment 10% 11% 12% 13% 14% 15% ...

    // You cannot use the array util you intitialize it.
    // In this case, you can do the initialization as follows:
    static void main() {
        double[][] balances = new double[2][2];
        int[][] magicSquare = {
                {1, 2},
                {3, 4}
        };

        System.out.println(balances[0][0]);
        System.out.println(balances[1][0]);
        System.out.println(balances[0][1]);
        System.out.println(balances[1][1]);

        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(magicSquare[i][j]);
            }
        }

        // foreach loop doens't loop though all elements two-dimensional arrays
        for (double[] row : balances) {
            for (double value : row) {
                // do something here
            }

        }
    }

}
