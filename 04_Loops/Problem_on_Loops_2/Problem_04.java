
import java.util.Scanner;



public class Problem_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row= sc.nextInt();
       for(int i=1; i<=row; i++){
        for(int j=i; j<=row; j++){
            System.out.print("*"+" ");
        }
        System.out.println();
       }
      
    }
    
}
