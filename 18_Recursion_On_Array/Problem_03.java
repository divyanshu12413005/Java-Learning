
import java.util.Scanner;



public class Problem_03 {

    static int gcd(int x,int y){
       if(y==0) return x;

       return gcd(y, x%y);
       
    }
    static int lcm(int x, int y){
        return (x*y/gcd(x,y));
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        
        System.out.println(gcd(x, y));
        System.out.println(lcm(x, y));
    }
}
