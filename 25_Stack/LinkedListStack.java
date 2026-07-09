public class LinkedListStack {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class Stack {

        private Node head = null;
        private int size = 0;

        // Push
        void push(int x) {

            Node newNode = new Node(x);

            newNode.next = head;
            head = newNode;

            size++;
        }

        // Pop
        int pop() {

            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return -1;
            }

            int value = head.data;

            head = head.next;

            size--;

            return value;
        }

        // Peek
        int peek() {

            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return -1;
            }

            return head.data;
        }

        // Display
        void display() {

            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return;
            }

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }

        // Size
        int size() {
            return size;
        }

        // Empty
        boolean isEmpty() {
            return head == null;
        }
    }

    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        st.display();

        System.out.println("Peek : " + st.peek());

        System.out.println("Pop : " + st.pop());

        st.display();

        System.out.println("Size : " + st.size());

        System.out.println("Is Empty : " + st.isEmpty());
    }
}