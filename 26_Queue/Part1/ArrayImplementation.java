public class ArrayImplementation {

    public static class QueueA {

        int f = -1;
        int r = -1;
        int size = 0;
        int arr[] = new int[100];

        // Add
        public void add(int data) {

            if (r == arr.length - 1) {
                System.out.println("Queue is Full");
                return;
            }

            if (f == -1) {
                f = r = 0;
            } else {
                r++;
            }

            arr[r] = data;
            size++;
        }

        // Remove
        public int remove() {

            if (f == -1) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int data = arr[f];

            if (f == r) {
                f = r = -1;
            } else {
                f++;
            }

            size--;
            return data;
        }

        // Peek
        public int peek() {

            if (f == -1) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[f];
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

            if (f == -1) {
                System.out.println("Queue is Empty");
                return;
            }

            for (int i = f; i <= r; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        QueueA q = new QueueA();

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