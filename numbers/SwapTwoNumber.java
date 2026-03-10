import java.util.Scanner;

public class SwapTwoNumber {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter first number
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        // Ask user to enter second number
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Display numbers before swapping
        System.out.println("Before Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap logic without using third variable
        a = a + b; // Step 1: Add both numbers
        b = a - b; // Step 2: Subtract b from a to get original a
        a = a - b; // Step 3: Subtract new b from a to get original b

        // Display numbers after swapping
        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Close scanner
        sc.close();
    }
}