
import java.util.Scanner;



public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binary_num= sc.nextInt();
        int ans=0;
        int power=1;
        while (binary_num > 0) {
            int last_digit = binary_num % 10;
            ans += last_digit * power;
            power *= 2;
            binary_num /= 10;
        }
        System.out.println("Decimal equivalent: " + ans);
    }
    
}
