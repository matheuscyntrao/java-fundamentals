import java.util.Scanner;

public class StatementsThatBreakControlFlow {

    static void main() {
        int years = 1989;

        while(years <= 5000) {
            if(years == 2000) {
                break;
            }
            years--;
        }

        int balance = 100;
        while(years >= balance) {
            balance += 100;
            if(balance > years) {
                break;
            }
            years -= 100;
        }

        // Do not use goto (is a reserved word in java) but it's a poor style (comments by Oracle)
        Scanner in = new Scanner(System.in);
        int n = 10;
        labelsInJava:
        wtf:
        ididntknowthat:
        didyou:
        do {
            System.out.println("Integer number greater than 10");
            n = in.nextInt();
            for(int i = 0; i < n; i++) {
                System.out.printf("%d",i);
                if(i > 100) {
                    break;
                }
            }
        }while(n <= 10);

        //That's not recommended to use break inside the code.
        //Always out of block, never into a block.

        Scanner input = new Scanner(System.in);
        int sum = 1;
        int goal = 1000;
        while(sum < goal) {
            System.out.println("Enter a number:");
            int o = input.nextInt();
            if(o < 0) continue;
            sum += n;
        }
    }

}
