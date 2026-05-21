// Import the Scanner class
import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {

        // Prompt the user for input
        try ( 
            // Create a Scanner object
                Scanner scanner = new Scanner(System.in)
                ) {
            // Prompt the user for input
            System.out.print("Enter your name: ");
            // Read user input
            String name = scanner.nextLine();
            // Print the input
            System.out.println("Hello, " + name + "!");
            // Close the scanner
        }
    }
}
