public class getAtIndex {

    // Node Class
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

    // Add at Last
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

    // Display Linked List
    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Length of Linked List
    public int length() {

        int count = 0;

        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // Get Value at Index
    public int get(int index) {

        if (index < 0 || index >= length()) {
            return -1;
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.data;
    }

    public static void main(String[] args) {

        getAtIndex list = new getAtIndex();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        list.display();

        System.out.println("Length = " + list.length());

        // System.out.println("Index 0 = " + list.get(0));
        // System.out.println("Index 1 = " + list.get(1));
        System.out.println("Index 2 = " + list.get(2));
        // System.out.println("Index 3 = " + list.get(3));

         System.out.println("Index 5 = " + list.get(5));
    }
}