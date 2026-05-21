class ArrayExample {
    void print1DArray() {
        int[] arr = { 1, 2, 3 };

        // Using a for loop to print the 1D array
        for (int array : arr) {
            System.out.println(array);
        }
       
    }
}

public class OneDArrayForEach {
    public static void main(String[] args) {
        ArrayExample example = new ArrayExample();
        example.print1DArray();
    }
}
