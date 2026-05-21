
import java.util.Scanner;



public class Problem_01 {
    static int firstOcc(int[] a, int target) {
        int n = a.length;
        int st = 0, end = n - 1;
        int fo = -1; // first occurrence index
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (a[mid] == target) {
                fo = mid; // found the element, but continue searching left
                end = mid - 1;
            } else if (target < a[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return fo; // return the first occurrence index or -1 if not found
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array in sorted order:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the target element to search:");
        int target = sc.nextInt();
        int result = firstOcc(a, target);
        System.out.println("First occurrence of the element"+ target + "is at index: " + result);
    }
    
}
