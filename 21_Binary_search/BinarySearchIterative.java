
import java.util.Scanner;



public class BinarySearchIterative {

    static boolean binarySearch(int[] a, int target) {
        int n = a.length;
        int st = 0, end = n - 1; // 0 based indexing
        while (st <= end) {
            int mid = (st + end) / 2;
            if (target == a[mid]) {
                return true;
            } else if (target < a[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array in sorted order:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the target element to search:");
        int target = sc.nextInt();
        boolean result = binarySearch(a, target);
        System.out.println("Element found:"+result);

    }
    
}
