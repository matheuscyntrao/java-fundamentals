package modulo_2;

public class DeclaringLocalVariablesWithVar {

    DefiningYourOwnClasses.Employee harry  = new DefiningYourOwnClasses.Employee();

    static void main() {

        var test = new EmployeeTest(); // Avoids repetition of the type name

        // Using the var notation in those cases where the type is obvious from the right-handm side
        // Do not use var with numeric types such as int, long or doule (0, 0L or 0.00)
        // You must declare the types of parameters and fields and then use var inside methods

    }

}
