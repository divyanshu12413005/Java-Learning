public class ArrayImplementation {

    static class Stack {

        private int[] arr = new int[5];
        private int idx = 0;

        // Push
        void push(int x) {

            if (isFull()) {
                System.out.println("Stack is Full!");
                return;
            }

            arr[idx] = x;
            idx++;
        }

        // Pop
        int pop() {

            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return -1;
            }

            idx--;
            return arr[idx];
        }

        // Peek
        int peek() {

            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return -1;
            }

            return arr[idx - 1];
        }

        // Display
        void display() {

            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return;
            }

            for (int i = idx - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // Current Size
        int size() {
            return idx;
        }

        // Total Capacity
        int capacity() {
            return arr.length;
        }

        // Empty
        boolean isEmpty() {
            return idx == 0;
        }

        // Full
        boolean isFull() {
            return idx == arr.length;
        }
    }

    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);

        st.display();

        System.out.println("Peek      : " + st.peek());
        System.out.println("Pop       : " + st.pop());
        System.out.println("Size      : " + st.size());
        System.out.println("Capacity  : " + st.capacity());
        System.out.println("Is Empty? : " + st.isEmpty());
        System.out.println("Is Full?  : " + st.isFull());

        st.display();
    }
}