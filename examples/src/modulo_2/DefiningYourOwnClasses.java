package modulo_2;

public class DefiningYourOwnClasses {

    // Work Horse classes that are needed for more sophisticated applications.
    // These classes typically do not have a main method.
    // Instead, they have their own instance fields and methods.
    // To build a complete program, you combine several classes, one of which has a main method.

    public static class Employee {

        // Instance fields
        int field1;
        int field2;
        int field3;

        // Constructor
        public Employee() {

        }

        // A method
        public void method1() {

        }

        public void method2() {

        }

        public void method3() {

        }

        static void main() {

            Employee[] staff = new Employee[3];

            staff[0] = new Employee();
            staff[1] = new Employee();
            staff[2] = new Employee();

        }
    }
}
