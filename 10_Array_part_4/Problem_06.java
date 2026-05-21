import java.util.Scanner;

public class Problem_06 {
    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
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
        System.out.print("Rotated Array: ");
        rotateArray(arr, k);
        printArray(arr);
      
    }
}
