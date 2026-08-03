package modulo_2;

public class Objects {

    // You should be able to identify three key characteristics of objects
    // Behavior - What can you do with this object or what methods can you apply to it (methods you call)
    // The objects state - how does the object react when you invoke those methods? (what the methods do)
        // Can change when you interact with but not spontaneously
        // If the object changes without a method call someone broke encapsulation
        // Influences rirectly with objects behavior
        // Order > Shipped > Paid > Delivered
    // Objects identity - how is the object distinguished from others that may have the same behavior and state?
        // Identifier (SQL id, UUID transactions, HashCode equals)
        // Differ AWAYS identity and USUALLY differ in their state

    // Identifying Classes
    // In a tradicional procedural program, you start the process at the top with the main function
    // When designing an object-oriented system, there is no "top" and newcomers to OOP often wonder where to begin.
    // The answer is: Identify your classes and then add methods to each class.
    // For example, in an order-processing system, some of the nouns are:
    // Item > Order > Shipping address > Payment > Account
    // Identify the object that has the major responsability for carrying it out.
    // When a new item is added to an order, the order object should be the one in charge because it knows how it stores and sorts items.
    // That is, add should be a method of the Order class that takes an Item object as parameter.

}
