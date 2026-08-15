package modulo_2;

public class ObjectConstruction {

    // Since object construction is so important, Java offers quite a verity of mechanisms for writing constructor.

    // Overloading
    // Some classes have more than one constructor, forexampl, you can construct an empty Stringuilder object as:
    static void main() {
        var message = new StringBuilder();
        var todoList = new StringBuilder("To do \n");
    }
    // The compiler must sort out which method to call by amtching the parameter types in the headers of the various methods.
    // A compile-time error occurs if the compiler cannot match the parameters, either because there is n match at all or because there is not one that is better than all others.
    // Overloading resolution

    // Default Field Initialization

    // If you don't set a field explicitly in a constructor, it is automatically set to a default value:
    // numbers to 0, boolean values to false, and objects references to null.
    // It's hard to someone to understand you code if fields are being initialized invisibly (and it can cause a lot of bugs)
    // NullPointerException in case of objects h.getName (without initianlizing)


}
