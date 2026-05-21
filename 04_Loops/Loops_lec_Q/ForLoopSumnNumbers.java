import java.util.Scanner;
public class ForLoopSumnNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        int sum=0;
       for(num=1; num<=n; num++){
        sum +=num;
       }

        System.out.println("Sum of first " + n + " numbers is: " + sum);
        
    }
    
}
