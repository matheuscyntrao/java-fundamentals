package exercises;

public class Arrays {

    static void main() {
        // Declaring Arrays
        // Access through index
        // Store collection of values of the same type
        int[] a;
        int[] b = new int[100]; // or var b = new int[100];
        // The array length need not be a constant new int[n];
        // Onde you created an array, you cannot change its langth (or copy to another new array)
        int c[]; // It's another valid way to declare, but sonar or lint will complain


        String[] authors = {
                "James Josling",
                "Bill Joy",
                "Guy Steele",
                // Adding more names and put a comma after each name
        };
        int[] smallPrimes = new int[] { 2, 3, 5, 7, 11, 13 };
        // Anonymous array
        int[] d = { 17, 19, 23, 29, 31, 37 }; // Without passing total of numbers, but the values
        smallPrimes = d; // This expression alocates a new array and fills it with the values inside the braces.
        // it counts the number of initial values and sets the array size accordingly;

        int[] x = new int[100];
        for(int i = 0; i< 100; i++)
            x[i] = i; // Fills the array with numbers 0 to 99

        String[] names = new String[10];
        for(int i = 0; i < 10; i++) names[i] = ""; // Warning: index out of bounds, always initialize you array (as we do with variables)





    }

}
