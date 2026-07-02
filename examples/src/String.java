import java.util.Arrays;

public class String {

    // String are sequence of Unicode characters. For example "Java/u1222" consists of the five Unicode characters
    // J, a, v, a and 'TM'. Java does not have a built-in string type.
    // Each quoted string is an instance of the String class:
    static void main() {

        java.lang.String string = "Testing string, stringBuilder and stringBuffer";
        // The first parameter is the index that you want to retrieve in this operation
        // The second, is the limit that you not want to copy
        // This will retrieve the characters between 0 and 2, exclusive the index 3
        // The counter of the substring is always b - a
        System.out.println(string.substring(0, 3));
        System.out.println(string.substring(1));
        System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());
        System.out.println(Arrays.toString(string.getBytes()));
        java.lang.String array = Arrays.toString(string.getBytes());
        System.out.println(array);
        // Concatenation
        java.lang.String expletive = "Expletive";
        java.lang.String PG13 = "Deleted";
        java.lang.String message = expletive + PG13;
        System.out.println(message);
        int age = 13;
        java.lang.String rating = "PG" + age;
        System.out.println(rating);
        System.out.println("The rating is " + rating);
        // Repeated
        java.lang.String repeated = "Java".repeat(3);
        System.out.println(repeated);
        // Join with delimiter
        java.lang.String all = java.lang.String.join(" / ", "A", "B", "C", "D");
        System.out.println(all);

        // Strings Are Immutable, if you need to change value, you can use concatenate to work around.
        java.lang.String greeting = rating.substring(0,1) + "p!";
        System.out.println(greeting);
        // Isn't efficient if you see need to change the value all the time, you can use substring to create new String
        // But the real benefit is the new String using replace or substring for example, use the same Character points to the same location.
        // The designers of Java decided the efficiency of sharing outweights the inneficiency of string editing (Memory Heap cost is cheaper)

        // C++ Notes

        /*

        char greeting[] = "Hello";
        char* greeting = "Hello";
        char* temp= malloc(6);
        strncpy(temp, greeting 3);
        strncpy(temp + 3, "p!", 3);
        greeting = temp;
        greeting = "Howdy";

        The original string was allocated on the heap.
        Even java doing garbage collection automatic, String share the Characters to avoid peaks of Heap Memory.

        */

        /* Equality Tests */
        java.lang.String s = "Some string";
        java.lang.String b = "Other String";

        s.equals(b); // Correct way to test strings
        s.equalsIgnoreCase(b);

        if(s == "Some string"); // Same location
        System.out.println(true);
        if(b.substring(0,3) == "Oth") // Same location
            System.out.println(true);
        else
            System.out.println(false);
        if("literalString".equals("Something literal or variable"))
            System.out.println("Literal Comparision");

        // JVM always arranges for equal string to be shared

        s = "";
        if(s.equals("") && s != null && string.length() != 0){
            System.out.println("Empty string");
        }

        // Code points and Code Units
        // The char type is a code unit for representing Unicode points in the UTF-16 encoding.
        // As we already see, some char needs a pair of Unicode to represent one Char

        java.lang.String test = "Hello";
        int n = test.length(); // Count of Char
        int cpCount  = greeting.codePointCount(0, test.length());
        char first = test.charAt(0);
        char last = test.charAt(test.length()-1);
        int offsetOfChar = 0;
        int index = test.offsetByCodePoints(0, offsetOfChar);
        int cp = test.codePointAt(index);

        // Do not use char type in your programs.

        // Move backwords statement to check code points

        java.lang.String sentence = "Some sencente maybe with emojis?";
        int index2 = 1;
        int cp2 = sentence.codePointAt(index);
        if (Character.isSupplementaryCodePoint(cp2))
            index2 += 2;
        else index2++;

        // It's quite painful, the correct way to do that is turns the sentence into a stream into an array of int (codepoints)
        int[] codePoints = sentence.codePoints().toArray();
        java.lang.String str = new java.lang.String(codePoints, 0, codePoints.length);









    }

}
