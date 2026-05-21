import java.util.Scanner;

public class Problem_03 {
    static int FindUnique(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] ) {
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> -1) {
                ans=arr[i];
            }
            
            
        }
        return ans;

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
       
        
        int result = FindUnique(arr);
        System.out.println("Unique element is: " + result);
        
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
