public class LinkedListImplementation {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class QueueLL {

        Node front = null;
        Node rear = null;
        int size = 0;

        // Add
        public void add(int data) {

            Node temp = new Node(data);

            if (front == null) {
                front = rear = temp;
            } else {
                rear.next = temp;
                rear = temp;
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

        // Size
        public int size() {
            return size;
        }

        // isEmpty
        public boolean isEmpty() {
            return size == 0;
        }

        // Display
        public void display() {

            Node temp = front;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        QueueLL q = new QueueLL();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.print("Queue : ");
        q.display();

        System.out.println("Removed : " + q.remove());

        System.out.print("Queue : ");
        q.display();

        System.out.println("Front : " + q.peek());

        System.out.println("Size : " + q.size());

        System.out.println("Is Empty : " + q.isEmpty());
    }
}