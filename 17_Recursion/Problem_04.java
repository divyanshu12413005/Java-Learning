
import java.util.Scanner;



public class Problem_04 {

    static int PrintFibonacci(int n){
        if(n==0) {
            return 0;
        }
        if(n==1) return 1;
        int ans=PrintFibonacci(n-1)+PrintFibonacci(n-2);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 0; i <= n; i++) {
            
            System.out.print(PrintFibonacci(i)+" ");
        }
    }
}
