public class deleteIndex {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;

    public void addLast(int data) {

        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public int length() {

        int count = 0;
        Node temp = head;

        while(temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public void deleteAtIndex(int index) {

        if(index < 0 || index >= length()) {
            System.out.println("Invalid Index");
            return;
        }

        if(index == 0) {

            head = head.next;

            if(head == null) {
                tail = null;
            }

            return;
        }

        Node temp = head;

        for(int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        if(temp.next == null) {
            tail = temp;
        }
    }

    public void display() {

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        deleteIndex list = new deleteIndex();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        list.display();

        list.deleteAtIndex(2);

        list.display();
    }
}