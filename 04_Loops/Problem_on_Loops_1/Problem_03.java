
import java.util.Scanner;



public class Problem_03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
    
        
        while(n>0){
           int  remainder= n%10;
           n= n/10;
         

           System.out.print(remainder);
        }
    }
    
}
