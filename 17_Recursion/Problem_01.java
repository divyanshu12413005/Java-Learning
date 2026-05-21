
import java.util.Scanner;



public class Problem_01 {

    static void PrintIntegers(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        PrintIntegers(n-1);
        System.out.println(n+" ");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        PrintIntegers(n);
    }
    
}
