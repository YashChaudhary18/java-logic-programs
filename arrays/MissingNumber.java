import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Maximum range
        int n = 100;

        // Boolean array to track numbers that appear
        boolean[] present = new boolean[n + 1];

        System.out.println("Enter numbers between 1 and 100");
        System.out.println("Enter -1 to stop input");

        while (true) {

            int num = sc.nextInt();

            // Break the loop if user enters -1
            if (num == -1) {
                break;
            }

            // Check if number is within valid range
            if (num >= 1 && num <= 100) {
                present[num] = true;
            } else {
                System.out.println("Invalid number! Enter between 1 and 100.");
            }
        }

        // Print missing numbers
        System.out.println("Missing numbers are:");

        for (int i = 1; i <= n; i++) {

            if (!present[i]) {
                System.out.print(i + " ");
            }
        }

        // Close scanner
        sc.close();
    }
}