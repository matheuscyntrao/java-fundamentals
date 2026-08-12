package modulo_2;

public class MethodParameters {

    // Call by value means that the method gets just the value that the caller provides.
    // In contrast, a call by reference means that the method gets the location of the variable that the caller provides.
    // Thus, a method can modify the value stored in a variable passed by reference but no in one passed by value.
    // These "call by..." terms are standard computer science terminology
    // describing the behavior of method parameters in various programming languages, not just Java.

    // There is also a call by name, that is mainly of historical interest, being employed in the algol programming languagem
    // One of the oldest high-level languages.

    // Java always use call by value, that means that the method gets a copy of all parameter values.
    // In particular, the method cannot modify the contents of any parameter variables passed to it.
    static void main() {
        double percent = 10;
        System.out.println(percent);
        // x is initializedwith a copy of the value of percent
        // x is trippled- it is now 30. but percent is still 10
        // The method ends, and the parameter variable x is no longe in use.
        tripleValue(percent);
    }
    // No matter how the method is implemented, we know that after the method call, the value of percent is still 10
    // Let us look a tilttle more closely at this situation.
    // Suppose a method tried to triplethe value of a method parameter:
    public static void tripleValue(double x) {
        x= 3 * x;
    }

    // Primitity types (numbers, boolean values)
    // Object references

    // In this case you can implement a method that triples the salary of an employee
    public static void trippleSalary(WorkingWithNullReferences.Employee2 x) {
        x.raiseSalary(200);
    }

    static void main2() {
        WorkingWithNullReferences.Employee2 harry = new WorkingWithNullReferences.Employee2();
        harry.raiseSalary(200);
    }

    // x is initialized with a copy of the value of harry - that is, an object reference
    // The raiseSalary method is applied to that oject reference. The employee object to which both x and harry refer gets its salary raised by 200 percent
    // The method ends, and the parameter variable x is no longer in use. Of course, the object variable harry
    // continues to refer to the object whose salary was tripled.
    // The method gets a copy of the object reference, and both the original and the copy refer to the same object.
    // Java doesn't call by reference for objects. THIS IS FALSE. (book authors have been saying shit haha)
}
