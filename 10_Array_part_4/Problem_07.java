
import java.util.Scanner;



public class Problem_07 {
    static int[] makeFrequencyArray(int[] arr){
        int[] freq= new int[10005]; // Assuming the elements are in the range 0 to 10005
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] freq= makeFrequencyArray(arr);
        System.out.println("Enter number of queries: ");
        int q = sc.nextInt();
        while (q> 0) {
            System.out.println("Enter the element to find its frequency: ");
            int x = sc.nextInt();
            if (freq[x]>0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            q--;
        }
        
    }

    
}
