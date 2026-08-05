import java.util.*;

public class ReverseQueue {

    public static void main(String[] args) {

        Queue<Integer> q = new ArrayDeque<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println("Original Queue : " + q);

        Stack<Integer> st = new Stack<>();

        // Queue -> Stack
        while (!q.isEmpty()) {
            st.push(q.remove());
        }

        // Stack -> Queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        System.out.println("Reversed Queue : " + q);
    }
}