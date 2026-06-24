public class palindromeLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean isPalindrome(Node head) {

        if(head == null || head.next == null){
            return true;
        }

        Node slow = head;
        Node fast = head;

        // Find Middle
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse Second Half
        Node prev = null;
        Node current = slow;

        while(current != null){

            Node next = current.next;

            current.next = prev;

            prev = current;
            current = next;
        }

        // Compare
        Node left = head;
        Node right = prev;

        while(right != null){

            if(left.data != right.data){
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);

        System.out.println(isPalindrome(head));
    }
}