package modulo_2;

public class StaticFieldsAndMethods {

    // One such fields per class.
    // In contrast, each object has its own copy of nonstatic instance fields.
    // Unique identification number to each employee.

    class Employee {
        private static int nextId = 1;
        private int id;

        // To share unique ID among all instances of the class.
        public void setId() {
            id = nextId;
            nextId++;
        }

    }

    public class Math {
        // You can access this constant in your programs as Math.PI
        public static final double PI = 3.45965358979323846;

        // System.out is algo have static context
        static void main() {
            System.out.println("You call directly of System.out");
        }
    }

    // Static methods are methods that do not operate on objects.
    // Math.pow(x,a)
    // This doesn't carry out any Math objects in his task.
    // They don't have "this" parameter (implicity parameter, which is the object itself)
    // Static methods can access static fields

    class Employee2 {
        private static int nextId2 = 1;

        public static int getNextId() {
            return nextId2;
        }

    }

    // Uses for static methods
    // When a methods doesn't need to access the object state because all needed parameters are supplied as explicit parameters
    // When a method only needs to access static fields of the class


}
