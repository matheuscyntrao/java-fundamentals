package modulo_2;

public class InitializationBlocks {

    // Setting value in a constructor
    // Assigning a value in the declaration

    class Employee {
        public static int nextId;

        private int id;
        private String name;
        private double salary;

        // Object initialization block
        {
            id = nextId;
            nextId++;
        }

        public Employee(String n, double s) {
            name = n;
            salary = s;
        }

        public Employee() {
            name = "";
            salary = 0;
        }

        // Overload constructors
        // A call to another costructor with this()
        // A no-argument constructor
        // An object initialization block
        // A static initialization block
        // An instance field initialization

    }

}
