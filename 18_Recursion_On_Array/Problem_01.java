
import java.util.Scanner;



public class Problem_01 {

    static void KTimesMultiple(int num,int k){
        if(k==0) {
            
            return;
        }
        KTimesMultiple(num, k-1);
        System.out.println(num*k);

       
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int k= sc.nextInt();
        
        KTimesMultiple(num, k);
    }
}
