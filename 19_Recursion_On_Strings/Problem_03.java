import java.util.Scanner;

public class Problem_03 {

    static String reverseString(String st, int idx) {
        // Base case: if the index reaches the length of the string, return an empty string
        if (idx == st.length()) return "";

        // Recursive call to get the reversed string from the rest of the string
        return reverseString(st, idx + 1) + st.charAt(idx);
    }

    static void checkPalindrome(String st) {
        String rev = reverseString(st, 0); // Get the reversed string
        if (rev.equals(st)) {
            System.out.printf("%s is a palindrome%n", st);
        } else {
            System.out.printf("%s is not a palindrome%n", st);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine(); // Input string
        int idx=0;

        System.out.println(reverseString(st, idx));

        checkPalindrome(st); // Check if the string is a palindrome
    }
}
