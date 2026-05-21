import java.util.Scanner;

public class Problem_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        
        for (int i = 1; i <= row; i++) {
            // Print spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  "); // Two spaces for better alignment
            }
            // Print stars
            for (int k = 1; k <= (i * 2 - 1); k++) {
                System.out.print("* "); // One space after each star
            }
            System.out.println(); // Move to the next line after each row
        }
        
        sc.close(); // Close the scanner
    }
}
