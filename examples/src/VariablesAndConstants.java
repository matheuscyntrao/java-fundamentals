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

}
