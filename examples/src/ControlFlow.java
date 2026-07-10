public class ControlFlow {

        // Java supports both conditional statements and loops to determine controle flow.

        // Block Scope

        // A block or compound statement consists of a number of Java statements,
        // surrounded by a pair of braces.

    static void main() {
        int n;

        if(true != false) {
            int k; // K is only defined up to here
        }

        // You may not declare identically named variables in two nested blocks.
        if(true != false) {
            int n; // K is only defined up to here
        }

        // Conditional Statements

        //if(condition statement)
        {
            // Execute multiple statements when a single condition is true.
        }

        int yourSales = 0;
        int targetSales = 100;
        if(yourSales > targetSales) {
            java.lang.String performance = "Satisfatory";
            int bonus = 1;
            System.out.println(performance + " Total: " + bonus);
        }



    }
}
