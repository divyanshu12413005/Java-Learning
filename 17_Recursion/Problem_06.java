
import java.util.Scanner;



public class Problem_06 {

    static int countDigits(int n){
        if(n/10==0){
            return 1;
        }
        int ans= countDigits(n/10)+1;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(countDigits(n));
    }
}
