import java.lang.String;
import java.util.stream.IntStream;

public class StringAPI {

    // Application Programming Interface
    static void main(String[] args) {
        // Returns the code unit at the specified location.
        char character = "Test".charAt(0);
        // Returns the code point that starts at the specified location.
        int codePoint = "Test".codePointAt(0);
        // Returns the index ofthe code point that is cpCount code points away from the code point at startIndex
        int offset = "Test".offsetByCodePoints(0, 1);
        // Returns negative value if the string comes before other in dictionary order,
        // Positive value if the string comes after
        // Zero if the string are equal
        int compare = "Test".compareTo("Teste");
        // returns the codepointsofthis string as a stream
        IntStream.rangeClosed(1, 5)
                .forEach(System.out::println);
        int[] test = "Teste".codePoints().toArray();
        int[] values = {83, 68, 69, 84};
        String result = new String(values, 0, values.length);
        System.out.println(result.isEmpty());
        System.out.println(result.isBlank());
        System.out.println(result.equals("Other String"));
        System.out.println(result.equalsIgnoreCase("Another String"));
        System.out.println(result.startsWith("Prefix"));
        System.out.println(result.endsWith("Suffix"));
        System.out.println(result.indexOf("A"));
        System.out.println(result.indexOf("Str",0));
        System.out.printf(String.valueOf(result.indexOf(1)));
        System.out.println(String.valueOf(result.indexOf(0,0)));

    }

}
