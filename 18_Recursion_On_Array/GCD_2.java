
import java.util.Scanner;



public class GCD_2 {

    static int gcd(int x,int y){
        int i;
        if(x<y)
        i=x;

        else i=y;
        for(i=i; i>1; i--){
            if(x%i==0 && y%i==0)
            return i;
        }
        return 1;



       
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        
        System.out.println(gcd(x, y));
    }
}
