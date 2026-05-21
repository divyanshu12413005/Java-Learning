import java.util.Scanner;

public class MergeSort {
    static void displayArr(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println(); // To move to the next line after displaying the array
    }

    static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) left[i] = arr[l + i];
        for (int j = 0; j < n2; j++) right[j] = arr[mid + 1 + j];

        // Merge the temporary arrays
        int i = 0, j = 0, k = l; // Start k from l
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) arr[k++] = left[i++]; // Use <= to maintain stability
            else arr[k++] = right[j++];
        }

        // Copy remaining elements of left[] if any
        while (i < n1) arr[k++] = left[i++];

        // Copy remaining elements of right[] if any
        while (j < n2) arr[k++] = right[j++];
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;

        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int x = sc.nextInt();
        int arr[] = new int[x];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        System.out.print("Original array: ");
        displayArr(arr);
        mergeSort(arr, 0, n - 1);
        System.out.print("Array after sorting: ");
        displayArr(arr);
    }
}
