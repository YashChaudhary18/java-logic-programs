import java.util.Scanner;

public class RemoveSpaces {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Variable to store result string without spaces
        String result = "";

        // Traverse each character of the string
        for (int i = 0; i < input.length(); i++) {

            // Get character at index i
            char ch = input.charAt(i);

            // Check if character is NOT a space
            if (ch != ' ') {
                result = result + ch; // Append character to result
            }
        }

        // Print string without spaces
        System.out.println("String after removing spaces: " + result);

        // Close scanner
        sc.close();
    }
}