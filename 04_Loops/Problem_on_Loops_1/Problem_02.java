
import java.util.Scanner;



public class Problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
    
        int sum=0;
        while(n>0){
           int  remainder= n%10;
           n= n/10;
         sum += remainder;

        }
        System.out.println(sum);
    }
    
}
