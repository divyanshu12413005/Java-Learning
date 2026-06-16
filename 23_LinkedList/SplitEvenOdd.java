public class SplitEvenOdd {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void splitEvenOdd(Node head) {

        Node oddHead = null;
        Node oddTail = null;

        Node evenHead = null;
        Node evenTail = null;

        Node temp = head;

        while (temp != null) {

            Node newNode = new Node(temp.data);

            if (temp.data % 2 == 0) {

                if (evenHead == null) {
                    evenHead = newNode;
                    evenTail = newNode;
                } else {
                    evenTail.next = newNode;
                    evenTail = newNode;
                }

            } else {

                if (oddHead == null) {
                    oddHead = newNode;
                    oddTail = newNode;
                } else {
                    oddTail.next = newNode;
                    oddTail = newNode;
                }
            }

            temp = temp.next;
        }

        System.out.print("Odd List : ");
        display(oddHead);

        System.out.print("Even List : ");
        display(evenHead);
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
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        splitEvenOdd(head);
    }
}