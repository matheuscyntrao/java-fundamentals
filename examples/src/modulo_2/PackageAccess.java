package modulo_2;

import java.awt.*;

public class PackageAccess {

    // You have already encountered the access modifiers public and private.
    // Features tagget as public can used by any class.
    // Private features can be used only by the class that defines them.

    // If you don't specify either public or private, the feature (that is, the class, method, or variable)
    // can be accessed by all methods in the same package.

    // Consider the program in Listing 4.2
    // The employee class was not defined as a public class.
    // Therefore, only the other classes (such as EmployeeTest) in the same package -the unnamed package in this case - can access it.

    // This, of course, break enchapsulation.
    // The problem is that it is awfully easy to foget to type the private keyword.

    // Always set private to your variables, because if anyone add another class into a package, them can modify variables.
    public class Window extends Container {
        String warningString;
    }
    
}
