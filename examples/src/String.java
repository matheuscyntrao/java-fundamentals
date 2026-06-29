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

    }

}
