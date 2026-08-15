package modulo_2;

public class ExplicitFieldInitialization {

    // By overloading the constructor methodsin a class,you can build many ways toset the initial state of the instance fields.
    // Set with something meaningful.

    class Employee {
        private String name = "";
        private static int nextId;
        private int id = assignId();

        // In C++ you cannot directly initialize instancefield of a class all fields must be set in a constructor.
        // In java,the initialization value doesn't have to be a constant value.
        // Here is an examplein which a field is initialized with a method call.
        private static int assignId() {
            int r = nextId;
            nextId++;;
            return r;
        }
    }

}
