package modulo_3;

public class JARFiles {

    // When you package your application, you want to give your users a single file, not a directory structure filled with class files.
    // Java Archive were designed for this purpose.
    // A JAR file can contain both class files and other files types such as image and sound files.
    // JAR files are compressed using the familiar ZIP compression format.

    // Creating JAR files

    // Use the jar tool to make JAR files.
    // To make a new JAR file:
    // jar cvf jarFileName file1 file2 ...
    // c: Create a new or empty arvhice and adds files to it. If any of the specified file names are directories, the jar program processes them recursively.
    // C: Temporarily changes the directory. For example: jar cvf jarFileName.jar -C classes *.class
    // e: creates an entry point in the manifest
    // f: Specifies the jar file name as the second command-line argument. If this paremeter is missing, jar will write the result to standard output.
    // i: Creates an index file (for speeding up lookups in a large archive).
    // m: Adds a manifest to the JAR file. A manifest is a description of the archive contents and origin. Every archive has a default manifest.
    // M: Doest not create a manifest file for the entries.
    // t: Displays the table of contents.
    // u: Updates an existing JAR file.
    // v: Generates verbose output
    // x: Extracts files. If you supply one or more file names, ony those files are extracted. Otherwise, all files are extracted.
    // 0: Stores without ZIP compression.

}
