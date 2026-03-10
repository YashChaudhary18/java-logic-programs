import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Remove leading and trailing spaces
        sentence = sentence.trim();

        // If sentence is empty
        if (sentence.isEmpty()) {
            System.out.println("Word count: 0");
        } 
        else {

            // Split sentence into words using space as delimiter
            String[] words = sentence.split("\\s+");

            // Count words
            int count = words.length;

            // Print result
            System.out.println("Total words in sentence: " + count);
        }

        // Close scanner
        sc.close();
    }
}