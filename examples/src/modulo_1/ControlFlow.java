package modulo_1;

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
            //int n; // K is only defined up to here
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

        if(yourSales >= targetSales) {
            java.lang.String performance = "Satisfactory";
            int bonus = 100;
        }
        else {
            java.lang.String performance = "Unsatisfactory";
            int bonus = 0;
        }

        // Else groups with the closest if.
        // Always use braces to clarify the code.
        if(yourSales > 100) {

        } else if (yourSales > 100 && yourSales < 150) {

        } else {

        }



    }
}
