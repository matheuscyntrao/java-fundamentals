import java.io.Serializable;

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
        for(int i=0; i < 10; i++) {} // Initiates an interative loop with variable inicialization, a condition and updates.
        do { // Executes a block at least once before evaluating a loop condition
        } while(true != false); // Keeps executing a block as long as its condition stays true
        // return // Exits a method and can optionally pass a value back to the caller
    }

    /*
        Access Modifiers
    */
    public void setsAccessibilityToCompletelyOpenAcrossTheEntireProgram() {};
    private void restrictsAccessibilityExclusivelyToTheClassThatsOwnIt() {};
    protected void restrictsVisibilityToTheSamePackageAndSubclasses(){};

    /*
        Modifiers (Non-Access)
    */

    abstract static class something {} // Flags a class that cannot be directly instantiated, or a method without code;
    final int test = 1; // Makes a variable unchangeable a method up-overrideable or a class un-extandable;
    static String hostname = ""; // Ties a member directly to the class blueprint rather than individual oject instances

    // Syncronized locks code block between multiple threads.
    static class SyncronizedMethod {
        private int count = 0;

        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    static class SinchronizedBlock {
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

    static class MultipleThreadsUsingSyncronizedMethod {
        private int count = 0;

        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SyncronizedMethod counter = new SyncronizedMethod();

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
    //package // Groups relative setsof classes and interface into distinct namespaces
    //import // Brings external packages or classes cleany into current code scope
    Something smt = new Something(); // Allocates memory dinamicallyto create a brand-new instance of an object.

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
    }
}
