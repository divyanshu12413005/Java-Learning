import java.util.Arrays;
import java.util.Scanner;

public class Questions {
    static int[] smallestAndLargestElement(int[] arr) {
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]};
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example input array
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = smallestAndLargestElement(arr);
        System.out.println("Smallest: " + ans[0]);
        System.out.println("Largest: " + ans[1]);

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
