public class TwoDArrayForEachLoop {
    public static void main(String[] args) {
        
        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

       
        for (int[] row : array) { // Iterate through each row
            for (int element : row) { // Iterate through each element in the row
                System.out.print(element + " ");
            }
            System.out.println(); 
        }
    }
}
