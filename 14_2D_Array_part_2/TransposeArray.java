
import java.util.Scanner;



public class TransposeArray {
    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {   // Loop through each row
            for(int j=0; j<arr[i].length; j++){  // Loop through each column in the row
                System.out.print(arr[i][j] + " ");
            }
            
            System.out.println();
        }
    }
    static void transpose(int[][] arr, int rows, int cols) {
        
        int[][] transposed = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = arr[i][j];
            }
        }
        
        System.out.println("Transposed Array:");
        printArray(transposed);
    }
    static void transposeInPlace(int[][] arr, int rows, int cols) {
        // only works for square matrices
        if (rows != cols) {
            System.out.println("In-place transposition is only possible for square matrices.");
            return;
        }
        
        
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                // Swap elements
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
        System.out.println("Transposed Array in place:");
        printArray(arr);
    }
     static int[][] transpos(int[][] arr, int rows, int cols) {
        // Create a new matrix for the transposed version
        int[][] transposed = new int[cols][rows];
        // Fill the transposed matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = arr[i][j];
            }
        }
        return transposed; // Return the transposed matrix
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < rows; i++) {
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Array:");
        printArray(arr);
       // transpose(arr, rows, cols);
       // transposeInPlace(arr, rows, cols);
        int[][] transposed = transpos(arr, rows, cols);
        System.out.println("Transposed Array:");
        printArray(transposed);
        sc.close();

       
        
        
        
        }
    
}
