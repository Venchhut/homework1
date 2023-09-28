import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Please enter your name: ");

        // Read the user's input as a String
        String name = scanner.nextLine();

        // Close the scanner to free up resources
        scanner.close();

        // Display a greeting
        System.out.println("Hello, " + name + "!");
    }
}
