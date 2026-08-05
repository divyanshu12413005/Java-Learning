import java.util.*;

public class ReorderQueue {

    public static void reorder(Queue<Integer> q) {

        int n = q.size();

        Stack<Integer> st = new Stack<>();

        // Step 1 : Move first half to stack
        for (int i = 0; i < n / 2; i++) {
            st.push(q.remove());
        }

        // Step 2 : Empty stack to queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // Step 3 : Move first(second) half to stack
        for (int i = 0; i < n / 2; i++) {
            st.push(q.remove());
        }

        // Step 4 : One by one add stack and queue
        while (!st.isEmpty()) {
            q.add(st.pop());
            q.add(q.remove());
        }

        // Step 5 : Reverse the queue using stack
        while (!q.isEmpty()) {
            st.push(q.remove());
        }

        while (!st.isEmpty()) {
            q.add(st.pop());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        System.out.println("Original Queue : " + q);

        reorder(q);

        System.out.println("Reordered Queue : " + q);
    }
}