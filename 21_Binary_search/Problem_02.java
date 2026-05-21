
import java.util.Scanner;


public class Problem_02 {
    static int sqrt(int x){
        int st = 0, end = x;
        int ans = -1;
        while (st <= end){
            int mid = st + (end - st) / 2;
            long val = (long) mid * mid; // use long here to avoid overflow
            if(val == x){
                return mid;
            } else if(val < x){
                ans = mid;
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find its square root:");
        int x = sc.nextInt();
        int result = sqrt(x);
        System.out.println("The square root of " + x + " is: " + result);
    
    }
    
}
