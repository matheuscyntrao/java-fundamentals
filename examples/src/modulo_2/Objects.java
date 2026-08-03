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

    // Relationships between classes

    // Dependence (uses-a) relationship, is the most obvious and also the most general. Order uses Account class. Item doesn't depende on the Account class. A class depends on another class if its methods use or manupulate objects of that class.
    // Aggregation (has-a) is easy to understand because its concrete, Order has Items = Containment.
    // Inheritance (is-a) express relationship between a more special and a more general class. RushOrder class inherits from an Order class. The specialized RushOrder class has special methods for priotiy handling and a different method for computing shipping charges, but its other methods, such as adding items and billing, are inherited from the Order class.

    // Unified Modeling Language (UML)
    // Inheritance (linha continua -> seta fechada)
    // Interface implementation (linha tracejada -> seta fechada)
    // Dependency (linha tracejada -> seta aberta)
    // Aggregation (losango -> linha continua)
    // Association (linha continua)
    // Directed association (linha continua -> seta aberta)

    // Using predefined classes (tomorrow)


}
