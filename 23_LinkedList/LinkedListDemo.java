public class LinkedListDemo {

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

    // Add Node at Last
    public void addLast(int data) {

        Node newNode = new Node(data);

        // Empty List
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        // Last node tak jao
        while (temp.next != null) {
            temp = temp.next;
        }

        // Last node ko new node se connect karo
        temp.next = newNode;
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

    public static void main(String[] args) {

        LinkedListDemo list = new LinkedListDemo();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        list.display();
    }
}