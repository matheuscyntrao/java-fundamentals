package modulo_2;

// Import statement is to give a shorthand to refer to the classes in the package.
import java.time.*;
import java.util.ArrayList;
import java.util.Date;

public class ClassImportation {

    // Fully qualified name - package name followed by the class name
    //java.time.LocalDate today = java.time.LocalDate.now();

   LocalDate today = LocalDate.now();

    static void main() {
        var deadline = new java.util.Date();
        //var today = new java.sql.Date(1992, 01, 15); Deprecated
    }

}
