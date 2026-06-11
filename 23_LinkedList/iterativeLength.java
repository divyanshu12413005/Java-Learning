public class iterativeLength {

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

    public int length() {

        int count = 0;

        Node current = head;

        while(current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public static void main(String[] args) {

        iterativeLength list = new iterativeLength();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println("Length = " + list.length());
    }
}