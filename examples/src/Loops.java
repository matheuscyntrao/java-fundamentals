import java.util.Scanner;

public class Loops {

    static void main() {
        boolean condition = false;
        int x = 100;
        while(!condition) {
            // The while loop executes a statement (which may be a block statement) while a condition is true
            if(java.lang.String.valueOf(x).equals("0"))
            {
                condition = true;
            }
            System.out.println(x);
            x--;
        }

        int balance = 100;
        int goal = 1000;
        while(balance < goal) {
            balance += 50;
            System.out.println(balance);
        }

        do {
            balance -= 500;
            System.out.println(balance);
        } while(balance > 100);

        //retirement();
        odd();
    }

    public static void retirement() {
        Scanner in = new Scanner(System.in);

        System.out.println("How much money do you need to retire?");
        double goal = in.nextDouble();

        System.out.println("How much money will you contribute every year?");
        double payment = in.nextDouble();

        System.out.println("Interestrate in %:");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        while(balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }

        System.out.println("You can retire in " + years + "years.");

    }

    public static void Retirement2() {
        Scanner in = new Scanner(System.in);

        System.out.println("How much money will you contribute every year?");
        double payment = in.nextDouble();

        System.out.println("Interest rate in %:");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;

        java.lang.String input;

        do {
            balance += payment;
            double interest = balance * interestRate/100;
            balance += interest;

            year++;

            System.out.printf("After year %d, your balance is %, .2f%n", year, balance);

            System.out.println("Ready to retire? (Y/N) ");
            input = in.next();

        } while(input.equals("N"));

    }

    // Controlled by counter or similar variable thatis updated every iteration
    int counter = 0; // You can also declare the variable outside, when you need to operate after for is complete.
    public static void determinateLoops() {
        // Be careful with testing for equality off floating-point numbers in loops.
        for(int i = 1;i <= 10; i++) {
            System.out.println(i);
        }
    }
    // Basically, the for loop is a shortcut for a while loop.



    static void odd() {

        // Odds of winning a lottery
        // Select 6 numbers for 1 to 50
        int lotteryOdd = 1;
        int k = 6; // Numbers of an odd
        int n = 50; // Higest number

        for(int i = 1; i <= k; i++) {
            lotteryOdd = lotteryOdd * (n - i + 1)/ i;
        }

        System.out.println(lotteryOdd);

    }

}
