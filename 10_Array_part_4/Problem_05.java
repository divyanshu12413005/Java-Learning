import java.util.Scanner;

public class Problem_05 {
    static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k is greater than n
        int[] ans = new int[arr.length];
        int j = 0;

        // Copy the last k elements to the beginning of the new array
        for (int i = n - k; i < n; i++) {
            ans[j] = arr[i];
            j++;
        }
        // Copy the first n-k elements to the end of the new array
        for (int i = 0; i < n - k; i++) {
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5};
        System.out.print("Original Array: ");
        printArray(arr);
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        int[] ans = rotateArray(arr, k);
        System.out.print("Rotated Array: ");
        printArray(ans);
    }
}
