
import java.util.Scanner;



public class MultiplicationOfArray {
    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {   // Loop through each row
            for(int j=0; j<arr[i].length; j++){  // Loop through each column in the row
                System.out.print(arr[i][j] + " ");
            }
            
            System.out.println();
        }
    }
    static void multiply(int[][]a,int r1,int c1, int[][]b, int r2,int c2){
        
        int[][] mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for(int j=0; j<c2; j++){
                mul[i][j] = 0; // Initialize the element to 0
                for(int k=0; k<c1; k++){ // Perform multiplication and sum
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
       
        System.out.println("Multiplication of the two matrices is: ");
        printArray(mul);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c1 = sc.nextInt();
        
        System.out.println("Enter the number of rows for second matrix: ");
        int r2 = sc.nextInt();
        System.out.println("Enter the number of columns for second matrix: ");
        int c2 = sc.nextInt();

        if (c1 != r2) {
    System.out.println("Error: Number of columns of the first matrix must be equal to the number of rows of the second matrix for multiplication.");
    sc.close();
    return;
}


        
        int[][] a = new int[r1][c1];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < r1; i++) {
            for(int j=0; j<c1; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int[][] b = new int[r2][c2];
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < r2; i++) {
            for(int j=0; j<c2; j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("First matrix is: ");
        printArray(a);
        System.out.println("Second matrix is: ");
        printArray(b);
       
        
       multiply(a, r1, c1, b, r2, c2);
        
        }
    
}
