package modulo_1;

import java.io.Serializable;
import java.lang.String;

public class JavaReservedWordsAndMeanings {

    /*
        Data Types and Return types
    */
    boolean declaresOneBitTrueOrFalse;
    byte declaresAnEightBitInteger;
    char declaresASixteenBitUnicodeCharacter;
    short declaresASixteenBitInteger;
    int declaresAThirtyTwoBitSignedInteger;
    long declaresASixtyFourBitSignedInteger;
    float declaresAThirtyTwoSinglePrecisionFloatingPointNumber;
    double declaresASixtyFourBitDoublePrecisionFloatPointNumber;
    void declaresThisMethodHasNoReturnValues(){};

    /*
        Flow Control
    */
    static boolean main() {
        if(true == false) {} // Starts a conditional branch execution
        else {} // Marks the fallback branch for a failed if condition
        switch(1) { // Evaluates an expression against multiple matching
            case 1: // Flags an individual block inside a switch evaluation
                System.out.println();
            break;
            case 2:
                System.out.println();
            break; // Instantly breaks out of a running loop or switch
            default: // Handles unmatched values inside a switch statement
            break;
        }
        for(int i=0; i < 10; i++) {} // Initiates an interactive loop with variable initialization, a condition and updates.
        do { // Executes a block at least once before evaluating a loop condition
        } while(true != false); // Keeps executing a block as long as its condition stays true
        // return // Exits a method and can optionally pass a value back to the caller
    }

    /*
        Access Modifiers
    */
    public void setsAccessibilityToCompletelyOpenAcrossTheEntireProgram() {};
    private void restrictsAccessibilityExclusivelyToTheClassThatOwnIt() {};
    protected void restrictsVisibilityToTheSamePackageAndSubclasses(){};

    /*
        Modifiers (Non-Access)
    */

    abstract static class something {} // Flags a class that cannot be directly instantiated, or a method without code;
    final int test = 1; // Makes a variable unchangeable a method up-overrideable or a class un-extendable;
    static String hostname = ""; // Ties a member directly to the class blueprint rather than individual object instances

    // Synchronized locks code block between multiple threads.
    static class SynchronizedMethod {
        private int count = 0;

        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    static class SynchronizedBlock {
        private int count = 0;
        private final Object lock = new Object();

        public void increment() {
            synchronized (lock) {
                count++;
            }
        }

        public int getCount() {
            return count;
        }
    }

    static class MultipleThreadsUsingSynchronizedMethod {
        private int count = 0;

        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedMethod counter = new SynchronizedMethod();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count: " + counter.getCount());
    }

    static class UserSession implements Serializable {
        String userId;
        transient Thread workerThread; // Instructs serialization systems to ignore this field when saving object data.
    }

    public static class NativeExample { // That a method is written in native machine code using another language like C++

        /*
        #include <jni.h>
        #include <stdio.h>

        JNIEXPORT void JNICALL
        Java_NativeExample_sayHello(JNIEnv *env, jobject obj) {
            printf("Hello from C!\n");
        }
        */

        public native void sayHello();

        static {
            System.loadLibrary("NativeLib");
        }

        public void main(String[] args) {
            new NativeExample().sayHello();
        }
    }

    static strictfp class Calculator {
        // Enforces consistent floating-point mathematical calculations across all hardware platforms.
        // After java 17+ this is default;
        double divide(double a, double b) {
            return a / b;
        }
    }


    /*
        Classes, Interfaces and Object Relationship
     */

    public class Something {} // Declares a brand-new blueprint type for creating objects
    public interface ISomething {} // Declares a contract of methods that classes must fulfill
    public enum PredefinedUnchangingValues {} // Declares a constant group of pre-defined, unchanging values
    public class SomethingTwo implements ISomething {} // Forces a class to implement specific interface architectures
    //package // Groups relative sets of classes and interface into distinct namespaces
    //import // Brings external packages or classes into current code scope
    Something smt = new Something(); // Allocates memory aerodynamically create a brand-new instance of an object.

    public void getInstanceOf() { // Compare an active object against a specific target class type
        System.out.println(smt instanceof ISomething);
    }

    public class ThisObject extends Something {

        private String name;

        public void test() {
            if (this.name.equals("TestName")); // This, refers explicity to the specific instance of object currently executing.
        }

        public class SuperTest extends Something {

            public SuperTest(){
                super(); // Targets and calls constructor methods or fields inside the parent
            }
        }

        /*
            Exception Handling and Testing
        */
        public void testing() throws Exception { // Throws Lists out exceptions a method might potentially fire into its calling chain
            try { // Wraps an isolated block of code to watch for potential internal exceptions

            } catch (Exception ex) { // Traps and processes a specific exception thrown by a companion try block
                assert(false == true); // Tests conditional logic assumptions during code debugging
            } finally //Guarantees critical code block runs immediately after handling
            {
                throw new Exception(); // Fires an explicit instance of an exception error directly out of code logic
            }
        }

        /*
            Unused Keywords

            const Reserved for potential future constant definitions (use final instead)
            goto Reserved to prevent accidental layout of unmaintainable, jumping spaghetti code

            Reserved Literals

            true: A literal representation of a positivo boolean evaluation
            false: A literal representation of a negative boolean evaluation
            null: A literal reference stating that an object variable points to empty

            Contextual Keywords

            var, record, sealed, permits, yield, module and requires.

            These act as restricted keywords only in specific structural locations - for example, when defining a local variable data type or a module path.

        */

    }
}
