public class MergeSortedLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node merge(Node head1, Node head2) {

        Node dummy = new Node(-1);
        Node tail = dummy;

        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null && temp2 != null) {

            if (temp1.data <= temp2.data) {

                tail.next = new Node(temp1.data);
                temp1 = temp1.next;

            } else {

                tail.next = new Node(temp2.data);
                temp2 = temp2.next;
            }

            tail = tail.next;
        }

        while (temp1 != null) {
            tail.next = new Node(temp1.data);
            tail = tail.next;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            tail.next = new Node(temp2.data);
            tail = tail.next;
            temp2 = temp2.next;
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

        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        Node result = merge(head1, head2);

        display(result);
    }
}