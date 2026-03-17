/* Print duplicate characters in string. */
import java.util.Scanner;

public class DuplicateCharacters {

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert string to lowercase for consistent comparison
        input = input.toLowerCase();

        // Convert string into character array
        char[] chars = input.toCharArray();

        System.out.println("Duplicate characters are:");

        // Loop through each character
        for (int i = 0; i < chars.length; i++) {

            int count = 1;

            // Skip spaces
            if (chars[i] == ' ')
                continue;

            // Compare current character with the rest
            for (int j = i + 1; j < chars.length; j++) {

                if (chars[i] == chars[j]) {
                    count++;

                    // Mark duplicate as visited
                    chars[j] = '0';
                }
            }

            // Print character if count > 1
            if (count > 1 && chars[i] != '0') {
                System.out.println(chars[i] + " : " + count);
            }
        }

        // Close scanner
        sc.close();
    }
}
