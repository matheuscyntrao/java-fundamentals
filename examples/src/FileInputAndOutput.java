import java.io.IOException;
import java.io.PrintWriter;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class FileInputAndOutput {

    // Unicode-UTF_8 is common but not universal for files and the internet
    // If you not Set the ecoding,the default is used which is the system encoding of the computer is running java
    Scanner in = new Scanner(Path.of("SomeFile.txt"), StandardCharsets.UTF_8);

    static void main() throws IOException {

        // If the file don't exist, it is created.
        PrintWriter out = new PrintWriter("SomeFile.txt", StandardCharsets.UTF_8);
        out.println("SomeShit");
        out.print("OtherShit");
        out.printf("AnotherShit");

        // It always needs to handle IO Exception, because we can receive permission and not found errors.

        // The root directory of created files is located where java virtual machine is running.
        // If you run this java program using the terminal, you can see the file at user.dir.
        String dir = System.getProperty("user.dir");



    }

    public FileInputAndOutput() throws IOException {
    }
}
