public class JavaLanguageSpecification {

    /* http://docs.oracle.com/javase/specs.

       Famous bug closed as it will be not fixed.
       http://bugs.java.com/bugdatabase/index.jsp ID 4252539

       A sun engineer added an explanation that the JVM does not mandate that main is public and the fixing it will cause
       potential troubles.

       http://docs.oracle/javase/specs/jvms/se8/html

       After the java laucher 1.4 the "sanity" came and the enforces the main method to be public.

       On the one hand, it is frustrating to have quality assurance engineers, who are often overworked and not always experts in the fine points of Java.
       (this is from a Sun engineers, but it is my opinion as well haha).

     */

    public class ClassName {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
        }
    }

    // Since Java 5
    public static void main(String... args){

    }

    // Since Java 21
    void main() {
        System.out.println("Hello, World!");
    }

    class Hello {
        void main() {
            System.out.println("Hello"); // After
        }
    }

    // One difference of C++ and Java is ALL functions are methods of a class.
    // The main method doesn't return an exit code.
    // The static functions are different, in Java, static doesn't operate any object (again).

}

