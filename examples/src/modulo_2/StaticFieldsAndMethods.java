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



}
