package modulo_2;
import static java.lang.System.*;
import static java.lang.Math.*;
public class StaticImports {

    // A form of the import statement permits the importing of static methods and field, not just classes.
    // The resulting code seems less clear.
    static void main() {
        out.println("That works too");
        exit(0);
        sqrt(2.0);
        pow(2.0, 2.0);
    }

}
