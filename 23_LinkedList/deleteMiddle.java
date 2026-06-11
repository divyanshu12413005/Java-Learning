public class deleteMiddle {

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

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Tumhara Logic
    public void deleteMiddle() {

        Node slow = head;
        Node fast = head;

        while (fast.next != null &&
               fast.next.next != null &&
               fast.next.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        if (slow.next == null) {
            head = null;
            tail = null;
            return;
        }

        slow.next = slow.next.next;

        if (slow.next == null) {
            tail = slow;
        }
    }

    public static void main(String[] args) {

        deleteMiddle list = new deleteMiddle();

        list.addLast(1);
        list.addLast(3);
        list.addLast(4);
        list.addLast(7);
        list.addLast(1);
        list.addLast(2);
        list.addLast(6);

        System.out.println("Before:");
        list.display();

        list.deleteMiddle();

        System.out.println("After:");
        list.display();
    }
}