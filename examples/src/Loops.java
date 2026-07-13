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

}
