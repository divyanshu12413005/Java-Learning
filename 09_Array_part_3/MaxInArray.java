import java.util.Scanner;

public class MaxInArray {
    static int max(int[] arr) {
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if current element is greater
            }
        }
        return max; // Return the maximum value found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = max(arr);
        System.out.println("Maximum element in the array: " + result);
        
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
