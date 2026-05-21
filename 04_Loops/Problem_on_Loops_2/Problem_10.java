import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        
        for (int i = 1; i <= row; i++) {
            // Print leading spaces for center alignment
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }
            
            // Print ascending numbers from 1 to i
            for (int k = 1; k <= i; k++) {
                System.out.print(k+" ");
            }
            
            // Print descending numbers from i-1 to 1
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l + " ");
            }
            
            // Move to next line
            System.out.println();
        }
        
        sc.close();
    }
}

