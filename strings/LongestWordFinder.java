/* Find longest word in a sentence. */
import java.util.Scanner;

public class LongestWordFinder {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split the sentence into words using space as delimiter
        String[] words = sentence.split(" ");

        // Variable to store the longest word
        String longestWord = "";

        // Loop through all words
        for (int i = 0; i < words.length; i++) {

            // Compare length of current word with longestWord
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        // Print the longest word
        System.out.println("Longest word in the sentence is: " + longestWord);

        // Print the length of the longest word
        System.out.println("Length of longest word: " + longestWord.length());

        // Close scanner
        sc.close();
    }
}
