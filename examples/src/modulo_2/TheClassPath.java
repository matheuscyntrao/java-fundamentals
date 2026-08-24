package modulo_2;

public class TheClassPath {

    // Classes are stored in subdirectories of the file system.
    // The path to the class must match the package name.
    // Class files can also be stored in a jar file.
    // JAR contains multiple class files and subdirectories in a compressed format, saving space and improving performance.
    // Third-part will usually be given one or more JAR files to include.

    /*
        To share classes among programs

        1 - Place you class files inside a directory
        /home/user/classdir
            Then the class file who will use, must be in the subdirectory
        /home/user/classdir/com/subdirectory/package
        2 - Place any JAR files inside a directory.
        /home/user/archives
        3 - Set the class path. The class path is the collection of all locations that can contain class files.
        UNIX: class path are separated by colons:
        /home/user/classdir:.:/home/user/archives/archive.jar
        WINDOWS: Separated by semicolons:
        c:\classdir;.;c:\archives\archive.jar

        Both cases, the period denotes the current directory.
        - The base directory or classdir
        - The current directory
        - The JAR file
        You can also use a wildcard for a JAR file directory
        /home/user/classdir:.:/home/user/archives/'*'
        UNIX: the * must be escaped to prevent shell expansion
        Don't include explicity the .class because Java API always searched for classes automatically

        The classpath list all directories and archives files that are starting points for locating classes.
        The JVM search first at the package, then goes to the classpath to search the references.
        And even if are not finded, then JVM goes to the archives.

        The compiler has a harder time locating files than does the virtual machine.
        If you refer to a class without specifying its package, the compiler first needs to find out the package that contains the class.
        It consults all import directives as possible sources for the class.
        Try to not use a lot of (*), 'cause this can cause performance issues
        Fully qualified classes must be unique to not cause problems when the compiler find two classes (at different levels) with the same name.

        If the compiler find two equal classes, he compares if what is newer than the other.
        You can just import public access classes, however you can import nonpublic classes from the current package.

     */

}
