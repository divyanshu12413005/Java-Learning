public class DLLPalindrome {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    public void addLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public boolean isPalindrome() {

        Node left = head;
        Node right = tail;

        while (left != right && left.prev != right) {

            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.prev;
        }

        return true;
    }

    public static void main(String[] args) {

        DLLPalindrome dll = new DLLPalindrome();

        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(2);
        dll.addLast(1);

        System.out.println(dll.isPalindrome());
    }
}