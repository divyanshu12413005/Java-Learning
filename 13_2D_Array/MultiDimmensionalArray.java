
import java.util.Scanner;



public class MultiDimmensionalArray {
    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {   // Loop through each row
            for(int j=0; j<arr[i].length; j++){  // Loop through each column in the row
                System.out.print(arr[i][j] + " ");
            }
            
            System.out.println();
        }
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
        // int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9} };
        
        printArray(arr);
        
        }
    
}
