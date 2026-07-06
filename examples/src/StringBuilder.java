import java.lang.String;
import java.util.Scanner;

public class StringBuilder {

    static void main() {
        // If you need to build up string from shorter strings, don't use string, use StringBuilder.
        // Why? Because every time that you concatenate a new string is created (String object constructor), this allocates more space at the heap memoery.
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("A");
        sb.append("PlusStringWhitoutCreatingAnotherObjectAtHeapMemory");
        sb.append("AfterWeReachOurObjectiveJustStartCallToStringToANewString");
        java.lang.String afterWeDoAllTheJob = sb.toString();

        System.out.println(sb.length());
        sb.appendCodePoint(12);
        sb.setCharAt(3,'C');
        sb.insert(4,"A partir do 4 caracter");
        sb.delete(4,6);
        System.out.println(sb);

        // Input and Output
        // We can use GUI to receive some input, or also as we see today as html pages, apis or microservices.
        // Reading Inputs with Scanner
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        String firstName = in.next();
        System.out.println("How old are you?");
        int age = in.nextInt();

    }

}
