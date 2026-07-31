package modulo_1;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing {

    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;

        int[] result = new int[k];
        for(int i = 0; i < result.length; i++) {
            int r = (int) (Math.random() * n);
            result[i] = numbers[r];
            numbers[r] = numbers[n -1];
            n--;
        }

        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you rich!");
        for(int r: result)
            System.out.println(r);

        // static toString(xxx[])
        // static xxx[] copyOf(xxx[] a, int end)
        // static xxx[] copyOfRange(xxx[] a, int start, int end)
        // static void sort (xxx[] a)

        // static int binarySearch(xxx[] a, xxx v)
        // static int binarySearch(xxx[] a int start, int end, xxx v) return the index or a negative value if it's not found
        // in this case, returned value -1 is the correct index to put some new elements to keep array sorted

        // static void fill(xxx[] a, xxx v) set all elements of the array to v
        // static boolean equals (xxx[] a, xxx[b] b) return true if the array have the same length and same values at corresponding index position


    }

}
