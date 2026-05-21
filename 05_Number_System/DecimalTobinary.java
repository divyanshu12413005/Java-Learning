
import java.util.Scanner;



public class DecimalTobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal_num = sc.nextInt();
        int ans=0;
        int power=1;
        
        while (decimal_num > 0) {
            int remainder = decimal_num % 2;
           ans += remainder * power;
            power *= 10;
            decimal_num /= 2;
        }
        
        System.out.println("Binary equivalent: " + ans);
    }
}