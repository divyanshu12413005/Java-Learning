public class twinMaxSum {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static int pairSum(Node head) {

        Node slow = head;
        Node fast = head;

        // Find Middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse Second Half
        Node prev = null;
        Node current = slow;

        while (current != null) {

            Node next = current.next;

            current.next = prev;

            prev = current;

            current = next;
        }

        // Find Maximum Twin Sum
        int maxSum = 0;

        Node left = head;
        Node right = prev;

        while (right != null) {

            int sum = left.data + right.data;

            maxSum = Math.max(maxSum, sum);

            left = left.next;
            right = right.next;
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(10);
        head.next.next = new Node(13);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(2);

        System.out.println("Maximum Twin Sum = " + pairSum(head));
    }
}