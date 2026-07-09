import java.util.Scanner;
import java.util.Stack;

public class CopyStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter the number of elements in the stack: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the stack: ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println("Original stack: " + st);

        Stack<Integer> copiedStack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();

        // Copy elements to tempStack to reverse the order
        while (!st.isEmpty()) {
            tempStack.push(st.pop());
        }
        System.out.println("Temporary stack (reversed order): " + tempStack);

        // Copy elements back to original stack and to copiedStack to maintain the same order
        while (!tempStack.isEmpty()) {
            int x = tempStack.pop();
            st.push(x);
            copiedStack.push(x);
        }
        System.out.println("Copied stack in the same order: " + copiedStack);

    }
}
