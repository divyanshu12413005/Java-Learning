import java.util.Scanner;

public class Problem_05 {
    static int FirstRepeatingNum(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] ) {
                  return arr[i];
                }
            }
        }
        return -1;

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
       
        
        int result = FirstRepeatingNum(arr);
        System.out.println("First repeating element is: " + result);
        
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
