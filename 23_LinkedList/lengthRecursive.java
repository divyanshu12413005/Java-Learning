public class lengthRecursive {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void addLast(int data) {

        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while(current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public int lengthRecursive(Node node) {

        if(node == null) {
            return 0;
        }

        return 1 + lengthRecursive(node.next);
    }

    public static void main(String[] args) {

        lengthRecursive list = new lengthRecursive();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println("Length = " + list.lengthRecursive(list.head));
    }
}