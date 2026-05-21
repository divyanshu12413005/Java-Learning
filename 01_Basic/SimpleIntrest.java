import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the principal amount:");
            float p=sc.nextFloat();
            
            System.out.println("Enter the Rate:");
            float r=sc.nextFloat();
            
            System.out.println("Enter the Time:");
            float t=sc.nextFloat();
            
            float si=(p*r*t)/100;
            System.out.println("Simple intrest is:" + si);
        }

    }
}
