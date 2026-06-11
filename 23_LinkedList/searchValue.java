public class searchValue {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void addLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public int search(int value) {

        Node temp = head;
        int index = 0;

        while (temp != null) {

            if (temp.data == value) {
                return index;
            }

            temp = temp.next;
            index++;
        }

        return -1;
    }

    public static void main(String[] args) {

        searchValue list = new searchValue();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(20);

        System.out.println("Index = " + list.search(30));
        System.out.println("Index = " + list.search(20));
        System.out.println("Index = " + list.search(100));
    }
}