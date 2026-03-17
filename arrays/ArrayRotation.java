/* Rotate array by k positions.*/  
import java.util.Scanner;

public class ArrayRotation {

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Ask user for number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Create array
        int[] arr = new int[n];

        // Take array elements from user
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Ask user for rotation value
        System.out.print("Enter number of positions to rotate (k): ");
        int k = sc.nextInt();

        // Handle cases where k > n
        k = k % n;

        // Temporary array to store rotated result
        int[] rotated = new int[n];

        // Copy elements from position k to end
        for (int i = 0; i < n - k; i++) {
            rotated[i] = arr[i + k];
        }

        // Copy first k elements to end
        for (int i = 0; i < k; i++) {
            rotated[n - k + i] = arr[i];
        }

        // Print rotated array
        System.out.println("Array after rotation:");

        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }

        // Close scanner
        sc.close();
    }
}
