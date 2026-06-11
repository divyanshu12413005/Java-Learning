public class nthFromLast {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // Add Last
    public void addLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // // Display
    // public void display() {

    //     Node temp = head;

    //     while (temp != null) {
    //         System.out.print(temp.data + " -> ");
    //         temp = temp.next;
    //     }

    //     System.out.println("null");
    // }

    // Length
    public int length() {

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // Method 1 : Using Length
    public int nthFromLastUsingLength(int n) {

        int len = length();

        if (n <= 0 || n > len) {
            return -1;
        }

        int index = len - n;

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.data;
    }

    // Method 2 : Two Pointer
    public int nthFromLastUsingTwoPointers(int n) {

        Node slow = head;
        Node fast = head;

        for (int i = 0; i < n; i++) {

            if (fast == null) {
                return -1;
            }

            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }

    public static void main(String[] args) {

        nthFromLast list = new nthFromLast();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

       //list.display();

        System.out.println("Using Length Method:");
        System.out.println(list.nthFromLastUsingLength(2));

        System.out.println("Using Two Pointer Method:");
        System.out.println(list.nthFromLastUsingTwoPointers(3));
    }
}