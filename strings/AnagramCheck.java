/* Check if two strings are anagrams. */
import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Asking user to enter first string
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        // Asking user to enter second string
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Convert both strings to lowercase
        // This avoids mismatch between 'A' and 'a'
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check if lengths are different
        // If length is different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            System.out.println("Not an Anagram");
            return;
        }

        // Convert strings to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are NOT Anagrams");
        }

        // Close scanner
        sc.close();
    }
}
