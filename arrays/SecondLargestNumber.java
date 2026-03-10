import java.util.Scanner;

public class SecondLargestNumber {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Create array
        int[] arr = new int[n];

        // Take array input from user
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize largest and second largest values
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop through the array
        for (int i = 0; i < n; i++) {

            // If current number is greater than largest
            if (arr[i] > largest) {

                // Move current largest to secondLargest
                secondLargest = largest;

                // Update largest
                largest = arr[i];
            }

            // Check for second largest
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        // Display result
        System.out.println("Second Largest Number is: " + secondLargest);

        // Close scanner
        sc.close();
    }
}