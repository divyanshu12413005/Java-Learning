import java.util.Scanner;

public class Problem_04 {
    static int max(int[] arr) {
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if current element is greater
            }
        }
        return max; // Return the maximum value found
    }

    static int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max; // Update secondMax before updating max
                max = arr[i]; // Update max
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i]; // Update secondMax if current element is less than max but greater than secondMax
            }
        }

        return secondMax; // Return the second maximum value found   
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

        int secondResult = findSecondMax(arr);
        System.out.println("Second maximum element in the array: " + secondResult);
        
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
