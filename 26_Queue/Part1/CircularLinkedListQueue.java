public class CircularLinkedListQueue {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class Queue {

        Node front = null;
        Node rear = null;
        int size = 0;

        // Add
        public void add(int data) {

            Node temp = new Node(data);

            if (front == null) {
                front = rear = temp;
                rear.next = front;
            } else {
                rear.next = temp;
                rear = temp;
                rear.next = front;
            }

            size++;
        }

        // Remove
        public int remove() {

            if (front == null) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int val = front.data;

            if (front == rear) {
                front = rear = null;
            } else {
                front = front.next;
                rear.next = front;
            }

            size--;
            return val;
        }

        // Peek
        public int peek() {

            if (front == null) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return front.data;
        }

        // Display
        public void display() {

            if (front == null) {
                System.out.println("Queue is Empty");
                return;
            }

            Node temp = front;

            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != front);

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        q.display();

        System.out.println("Removed : " + q.remove());

        q.display();

        System.out.println("Front : " + q.peek());
    }
}