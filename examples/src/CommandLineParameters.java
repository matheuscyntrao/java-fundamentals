public class CommandLineParameters {

    static void main(String[] args) {
        if(args.length == 0 || args[0].equals("-h"))
            System.out.println("Hello");
        else if (args[0].equals("-g"))
            System.out.println("Good bye!");
        for(int i = 0; i < args.length; i++)
            System.out.println(" " + args[i]);
        System.out.println("!");
    }

    // javac CommandLineParameters.java
    // java CommandLineParameters -g cruel world

}
