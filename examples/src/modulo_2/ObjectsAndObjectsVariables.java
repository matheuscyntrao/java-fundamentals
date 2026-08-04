package modulo_2;

import java.util.Date;

public class ObjectsAndObjectsVariables {

    // To work with objets, you irst construct them and specify their initial state.
    // Then you apply methods to the objects.

    // In the Java programming language, you use constructors to construct new instances.
    // A constructor is a special method whose purpose is to construct and initialize objects.
    // Let us look at an example.

    // The standard Java library constains a Date class.
    // Its objects describe points in time, such as December 31, 1999, 23:59:59 GMT.

    // Constructors always have the same name as the class name.
    // Thus, the constructor for the Date class is called Date. To construct a Date object, combine the constructor with the new operator.

    static void main() {
        Date date = new Date();

        System.out.println(new Date());
        String s = new Date().toString();
        Date birthDay; // deadline doesn't refer to any object
        //System.out.println(birthDay.toString()); // Not yet, compile error

        // You must first initialize the birthDay variable (new Date or refer to another Date variable

        birthDay = null; // refers to no object (but this can cause nullpointerexception

    }

}
