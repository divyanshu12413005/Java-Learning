import java.util.*;

public class ReverseFirstKElements {

    public static void main(String[] args) {

        Queue<Integer> q = new ArrayDeque<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);

        int k = 3;

         System.out.println("Original Queue : " + q);

        reverseFirstK(q, k);

        System.out.println("Queue after reversing first " + k + " elements : " + q);
    }

    public static void reverseFirstK(Queue<Integer> q, int k) {

        Stack<Integer> st = new Stack<>();

        // Step 1
        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }

        // Step 2
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // Step 3
        int rem = q.size() - k;

        for (int i = 0; i < rem; i++) {
            q.add(q.remove());
        }
    }
}