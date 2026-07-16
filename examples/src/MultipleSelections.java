import java.util.Scanner;

@SuppressWarnings("fallthourgh")
public class MultipleSelections {

    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Select an option (1, 2, 3, 4)");
        int choice = in.nextInt();

        switch(choice) {
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
            default: break;
        }

        // I don't know why, but I guess oracle don't like switch statement that much (use Strategy)
    }

}
