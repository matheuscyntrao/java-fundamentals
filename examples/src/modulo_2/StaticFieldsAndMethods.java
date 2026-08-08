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



}
