public class VariablesAndConstants {

    // In Java, every variable has a type.
    // Type first followed by the name.
    double salary;
    int vacationDays;
    long eartchPopulation;
    boolean done;

    // Must begin with letter and must be a sequence of letters or digits. A-Z a-z _ $ or any unicode character that denotes a letter in a language.

    // Symbols like + cannot be used inside.

    static void main() {

        System.out.println(Character.isJavaIdentifierPart('a')); // true = if is a valid
        System.out.println(Character.isJavaIdentifierStart(' ')); // false

        // You also cannot use Java reserved word as a variable name.

        // You can declare multiple variable on a single line.
        int i, j, k, l; // It's not a good pratice, because are not easier to read. #cleanCode

        Character character = new Character('A'); // Use the same name in lower case to make you software easier to read.
        Character aCharacter = new Character('S'); // This is another used way programmers uses.

        // Variables MUST be initialized to not cause error during compile phase.

        int vacationDays;
        //System.out.println(vacationDays);

        int vacationDays2;
        vacationDays2 = 1;

        int vacationDays3 = 1;

        // You can declare anywhere you need in your code
        int variable = 1;
        System.out.println(variable);
        int vacationDays4 = 4;



    }


    // Constants

    public class Constants {

        public static void main(String[] args) {
            final double CM_PER_INCH = 2.54; // Always use final instead const, is a java reserved word
            double paperWidth = 8.5;
            double paperHeight = 11;
            System.out.println("Paper size in centimeters: " +
                    paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
        }

    }

    public class Constants2 {

        public static final double CM_PER_INCH = 2.54; // Also can be acessable from other methods outside of this class

        static void main() {
            double paperWidth = 8.5;
            double paperHeight = 11;
            System.out.printf("Paper size in centimeters: " +
                    paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
        }

    }

    // Many Intel processors compute x * y, leave the result in 80-it register, then divide by z, and finally truncate the result back to 64 bits. It can avoid exponent overflow.
    // But the result may be different from a computation that uses 64 bits throughout.

    // The initial specification of the Java virtual machine mandated that all intermediate computations must be truncated.

    // This is slower than the more precise computations because the truncation operations take time.

    // Java was updated  to recognize the conflicting demands for optimum performance and perfect reproducibility.

    // strictfp = this is default after java 17+, but we can also declare in earliest versions of java.


}


