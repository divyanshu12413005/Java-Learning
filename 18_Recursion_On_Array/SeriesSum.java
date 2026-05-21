
import java.util.Scanner;
public class SeriesSum {

    static int sum(int n){
        if(n==0) return n;

        return sum(n-1)+n;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        System.out.println(sum(n));

    }
}
