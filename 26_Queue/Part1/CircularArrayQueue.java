public class CircularArrayQueue {

    public static class QueueA {

        int[] arr = new int[5];
        int front = -1;
        int rear = -1;
        int size = 0;

        // Add
        public void add(int data) {

            if (size == arr.length) {
                System.out.println("Queue is Full");
                return;
            }

            if (size == 0) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % arr.length;
            }

            arr[rear] = data;
            size++;
        }

        // Remove
        public int remove() {

            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int val = arr[front];

            if (size == 1) {
                front = rear = -1;
            } else {
                front = (front + 1) % arr.length;
            }

            size--;
            return val;
        }

        // Peek
        public int peek() {

            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[front];
        }

        // Display
        public void display() {

            if (size == 0) {
                System.out.println("Queue is Empty");
                return;
            }

            int i = front;

            while (true) {

                System.out.print(arr[i] + " ");

                if (i == rear)
                    break;

                i = (i + 1) % arr.length;
            }

            System.out.println();
        }

        // Size
        public int size() {
            return size;
        }

        // isEmpty
        public boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {

        QueueA q = new QueueA();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        q.display();

        System.out.println("Removed : " + q.remove());
        System.out.println("Removed : " + q.remove());

        q.display();

        q.add(60);
        q.add(70);

        q.display();

        System.out.println("Front : " + q.peek());
        System.out.println("Size : " + q.size());
    }
}