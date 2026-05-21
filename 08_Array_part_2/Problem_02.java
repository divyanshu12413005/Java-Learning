import java.util.Scanner;

class Question {  // Corrected class name to follow Java conventions (PascalCase)
    static int LastOccurences(int[] arr, int x) {
        int LastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                LastIndex=i;
            }
        }
        return LastIndex;
    }
}

public class Problem_02 { // Corrected class name to follow Java conventions (PascalCase)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 6;
        arr[2] = 1;
        arr[3] = 5;
        arr[4] = 1;

        System.out.println("Enter the x:");
        int x = sc.nextInt();

        int LastIndex = Question.LastOccurences(arr, x);
        System.out.println("The Last Index " + LastIndex );
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
