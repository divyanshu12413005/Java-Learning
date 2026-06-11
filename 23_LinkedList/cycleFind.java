public class cycleFind {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public boolean hasCycle() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        cycleFind list = new cycleFind();

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        list.head = n1;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // Cycle
        n4.next = n2;

        System.out.println(list.hasCycle());
    }
}