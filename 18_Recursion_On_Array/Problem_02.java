
import java.util.Scanner;



public class Problem_02 {

    static int sumSeries(int n){
        if(n==0){
           
            return n;
        }
        if(n%2==0){
       
       return  sumSeries(n-1)-n;
        }
        else
        return sumSeries(n-1)+n;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
       System.out.println(sumSeries(n)); 
    }
    
}
