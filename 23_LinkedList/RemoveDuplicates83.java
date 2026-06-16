public class RemoveDuplicates83 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node deleteDuplicates(Node head) {

        Node current = head;

        while (current != null && current.next != null) {

            if (current.data == current.next.data) {

                current.next = current.next.next;

            } else {

                current = current.next;
            }
        }

        return head;
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