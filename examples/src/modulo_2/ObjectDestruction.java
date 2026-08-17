package modulo_2;

public class ObjectDestruction {

    // Java does automatic garbage collection, manual memory reclamation is not needed.
    // Java doest not support destructors.
    // System resources and files are the trouble here.
    // It's important the resource be reclaimed when it is no longer needed.
    // You can use close method that does the necessary cleanup.
    // Runtime.addShutdownHook
    // After java 9, Cleaner class register an action that is carried out when an object is no longer reachable.

}
