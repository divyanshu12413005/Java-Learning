import java.util.*;

public class Leetcode225 {

    static class MyStack {

        Queue<Integer> q = new ArrayDeque<>();

        // Push
        public void push(int x) {

            q.add(x);

            for (int i = 0; i < q.size() - 1; i++) {
                q.add(q.remove());
            }
        }

        // Pop
        public int pop() {
            return q.remove();
        }

        // Top
        public int top() {
            return q.peek();
        }

        // Empty
        public boolean empty() {
            return q.isEmpty();
        }
    }

    public static void main(String[] args) {

        MyStack st = new MyStack();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.top());

        System.out.println(st.pop());

        System.out.println(st.top());

        System.out.println(st.empty());
    }
}