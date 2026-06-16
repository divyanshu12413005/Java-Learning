public class RemoveDuplicates82 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node deleteDuplicates(Node head) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;
        Node current = head;

        while (current != null) {

            while (current.next != null &&
                   current.data == current.next.data) {

                current = current.next;
            }

            if (prev.next == current) {

                prev = prev.next;

            } else {

                prev.next = current.next;
            }

            current = current.next;
        }

        return dummy.next;
    }

    public static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        System.out.println("Before:");
        display(head);

        head = deleteDuplicates(head);

        System.out.println("After:");
        display(head);
    }
}