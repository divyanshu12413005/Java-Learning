import java.util.Stack;

public class Leetcode232 {

    static class MyQueue {

        Stack<Integer> st1;
        Stack<Integer> st2;

        public MyQueue() {
            st1 = new Stack<>();
            st2 = new Stack<>();
        }

        // Push
        public void push(int x) {
            st1.push(x);
        }

        // Pop
        public int pop() {

            if (st2.isEmpty()) {
                while (!st1.isEmpty()) {
                    st2.push(st1.pop());
                }
            }

            return st2.pop();
        }

        // Peek
        public int peek() {

            if (st2.isEmpty()) {
                while (!st1.isEmpty()) {
                    st2.push(st1.pop());
                }
            }

            return st2.peek();
        }

        // Empty
        public boolean empty() {
            return st1.isEmpty() && st2.isEmpty();
        }
    }

    public static void main(String[] args) {

        MyQueue q = new MyQueue();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println("Front : " + q.peek());

        System.out.println("Removed : " + q.pop());

        System.out.println("Front : " + q.peek());

        q.push(40);

        System.out.println("Removed : " + q.pop());

        System.out.println("Removed : " + q.pop());

        System.out.println("Front : " + q.peek());

        System.out.println("Is Empty : " + q.empty());
    }
}