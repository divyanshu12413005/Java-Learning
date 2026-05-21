class ArrayExample {
    void print1DArray() {
        int[] arr = { 1, 2, 3 };

        // Using a for loop to print the 1D array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Print a new line after the array
    }
}

public class OneDArrayForLoop {
    public static void main(String[] args) {
        ArrayExample example = new ArrayExample();
        example.print1DArray();
    }
}
