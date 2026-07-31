package modulo_1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class BigNumbers {

    static void main() {
        // If the precision of the basic integer and floating-point is not sufficient

        BigInteger bigInt = BigInteger.valueOf(100);
        BigInteger reallyBig = new BigInteger("112312321312312312321312312312321321312312313213123123123123123123123123");

        System.out.println(BigInteger.ZERO);
        System.out.println(BigInteger.ONE);
        System.out.println(BigInteger.TEN);
        System.out.println(BigInteger.TWO);

        System.out.println(bigInt.add(reallyBig));
        System.out.println(bigInt.multiply(bigInt));
        System.out.println(bigInt.parallelMultiply(bigInt));
        System.out.println(bigInt.subtract(BigInteger.valueOf(1)));
        System.out.println(bigInt.mod(BigInteger.valueOf(1)));
        System.out.println(bigInt.sqrt());
        System.out.println(bigInt.compareTo(reallyBig));
        System.out.println(BigInteger.valueOf(123123123123123L));

        BigDecimal valor1 = new BigDecimal("2.00");
        BigDecimal valor2 = new BigDecimal("1.10");
        BigDecimal errado = new BigDecimal(2.00);

    }

    public static void lottery(){
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you need to draw");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();

        BigInteger lotteryOdds = BigInteger.valueOf(1);

        for(int i = 0; i < k; i++) {
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - 1 + 1)).divide(BigInteger.valueOf(1));
        }

        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
    }


}
