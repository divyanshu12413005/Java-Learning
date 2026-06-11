public class cycleFindNode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public Node detectCycleStart() {

        Node slow = head;
        Node fast = head;

        // Step 1: Detect Cycle
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                // Step 2: Find Starting Node
                Node temp = head;

                while (temp != slow) {
                    temp = temp.next;
                    slow = slow.next;
                }

                return temp;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        cycleFindNode list = new cycleFindNode();

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        list.head = n1;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // Cycle create
        n4.next = n2;

        Node result = list.detectCycleStart();

        if (result != null) {
            System.out.println("Cycle starts at node: " + result.data);
        } else {
            System.out.println("No Cycle");
        }
    }
}