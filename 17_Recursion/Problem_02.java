
import java.util.Scanner;



public class Problem_02 {

    static void PrintReverseIntegers(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        PrintReverseIntegers(n-1);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        PrintReverseIntegers(n);
    }
    
}
