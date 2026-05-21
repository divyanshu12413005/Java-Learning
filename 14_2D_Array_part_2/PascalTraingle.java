
import java.util.Scanner;
public class PascalTraingle {
    static void printArray(int[][] arr){
         for (int i = 0; i < arr.length; i++) {   // Loop through each row
            for(int j=0; j<arr[i].length; j++){  // Loop through each column in the row
                System.out.print(arr[i][j] + " ");
            }
            
            System.out.println();
        }

    }

    static int[][] generatePascalTriangle(int n) {
        int[][] triangle = new int[n][];
        
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1]; // Each row has one more element than the previous
            
            triangle[i][0] = 1; // First element is always 1
            triangle[i][i] = 1; // Last element is always 1
            
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j]; // Sum of two elements above
            }
        }
        
        return triangle;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for Pascal's Triangle:");
        int n = sc.nextInt();
        
        int[][] pascalTriangle = generatePascalTriangle(n);
        
        System.out.println("Pascal's Triangle:");
        printArray(pascalTriangle);
    }

    
}
