
import java.util.Scanner;



public class Problem_07 {

    static int SquareOfDigits(int p,int q){
        if(q==0) return 1;

        return SquareOfDigits(p, q-1)*p;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int p= sc.nextInt();
        int q= sc.nextInt();
        System.out.println(SquareOfDigits(p,q));
    }
}
