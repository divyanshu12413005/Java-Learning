
import java.util.Scanner;



public class RecBinarySearch {

    static boolean recBinarySearch(int[] a, int st, int end, int target) {
        if (st > end) return false; // base case
        int mid = (st + end) / 2;
        if (target == a[mid]) {
            return true;
        } else if (target < a[mid]) {
            return recBinarySearch(a, st, mid - 1, target); // subproblems
        } else {
            return recBinarySearch(a, mid + 1, end, target); // subproblems
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array in sorted order:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the target element to search:");
        int target = sc.nextInt();
        boolean result = recBinarySearch(a, 0, n - 1, target);
        System.out.println("Element found: " + result);
    }
    
}
