import java.util.Scanner;

class Question {  // Corrected class name to follow Java conventions (PascalCase)
    static int CountOccurences(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }
}

public class Problem_01 { // Corrected class name to follow Java conventions (PascalCase)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 5;
        arr[3] = 1;
        arr[4] = 5;

        System.out.println("Enter the x:");
        int x = sc.nextInt();

        int count = Question.CountOccurences(arr, x);
        System.out.println("The element " + x + " occurs " + count + " times in the array.");
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
