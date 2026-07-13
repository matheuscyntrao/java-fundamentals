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

}
