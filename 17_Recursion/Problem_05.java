
import java.util.Scanner;



public class Problem_05 {

    static int SumOfDigits(int n){
        if(n>=0 && n<=9){
            return n;
        }
        int ans= SumOfDigits(n/10)+n%10;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(SumOfDigits(n));
    }
}
