import java.util.Arrays;

class Main {
    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class RefrenceInJava {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 8;
        arr[4] = 9;
        System.out.println("Original Array");
        Main.PrintArray(arr);

        // trying to copy arr to arr_2 using different methods

        // 1. Using direct assignment (reference copy)
        int[] arr_2 = arr; // This is a reference copy
        System.out.println("\nCopied Array using direct assignment (arr_2 = arr)");
        Main.PrintArray(arr_2);
        arr_2[0] = 0;
        arr_2[1] = 0;
        System.out.println("Original array after changing arr_2 (direct assignment)");
        Main.PrintArray(arr);
        System.out.println("Copied array after changing arr_2 (direct assignment)");
        Main.PrintArray(arr_2);

        // Reset arr
        arr[0] = 5;
        arr[1] = 6;

        // 2. Using clone() method (shallow copy)
        int[] arr_3 = arr.clone(); // This creates a new array with the same elements
        System.out.println("\nCopied Array using clone()");
        Main.PrintArray(arr_3);
        arr_3[0] = 0;
        arr_3[1] = 0;
        System.out.println("Original array after changing arr_3 (clone)");
        Main.PrintArray(arr);
        System.out.println("Copied array after changing arr_3 (clone)");
        Main.PrintArray(arr_3);

        // Reset arr
        arr[0] = 5;
        arr[1] = 6;

        // 3. Using Arrays.copyOf() method (deep copy)
        int[] arr_4 = Arrays.copyOf(arr, arr.length); // Creates a new array
        System.out.println("\nCopied Array using Arrays.copyOf()");
        Main.PrintArray(arr_4);
        arr_4[0] = 0;
        arr_4[1] = 0;
        System.out.println("Original array after changing arr_4 (copyOf)");
        Main.PrintArray(arr);
        System.out.println("Copied array after changing arr_4 (copyOf)");
        Main.PrintArray(arr_4);

        // Reset arr
        arr[0] = 5;
        arr[1] = 6;

        // 4. Using Arrays.copyOfRange() method (deep copy of a range)
        int[] arr_5 = Arrays.copyOfRange(arr, 1, 4); // Copies elements from index 1 (inclusive) to 4 (exclusive)
        System.out.println("\nCopied Array using Arrays.copyOfRange()");
        Main.PrintArray(arr_5);
        if (arr_5.length > 0) {
            arr_5[0] = 0;
        }
        System.out.println("Original array after changing arr_5 (copyOfRange)");
        Main.PrintArray(arr);
        System.out.println("Copied array after changing arr_5 (copyOfRange)");
        Main.PrintArray(arr_5);
    }
}
