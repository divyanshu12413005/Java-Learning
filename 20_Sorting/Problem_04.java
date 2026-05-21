
import java.util.Scanner;

public class Problem_04 {
    static void display(int[] num) {
        for (int val : num) {
            System.out.print(val + " ");
        }
       
    }
    static void partition(int[] num) {
        int l = 0, r = num.length - 1;
        while (l < r) {
            while (num[l] < 0) l++;
            while (num[r] >= 0) r--;
            if (l < r) {
                int temp = num[l];
                num[l] = num[r];
                num[r] = temp;
                l++;
                r--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        partition(num);
        display(num);
        
    }
}
