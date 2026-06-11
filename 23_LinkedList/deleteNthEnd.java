public class deleteNthEnd {

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

    // Add Last
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

    // Display
    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Length
    public int length() {

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // // Method 1 : Using Length
    // public int nthFromLastUsingLength(int n) {

    //     int len = length();

    //     if (n <= 0 || n > len) {
    //         return -1;
    //     }

    //     int index = len - n;

    //     Node temp = head;

    //     for (int i = 0; i < index; i++) {
    //         temp = temp.next;
    //     }

    //     return temp.data;
    // }

    // Method 2 : Two Pointer
  public void deleteNthFromLastUsingTwoPointers(int n) {

    if (head == null) {
        System.out.println("List is Empty");
        return;
    }

    Node slow = head;
    Node fast = head;

    // Fast ko n steps aage le jao
    for (int i = 0; i < n; i++) {

        if (fast == null) {
            System.out.println("Invalid n");
            return;
        }

        fast = fast.next;
    }

    // First node delete karna hai
    if (fast == null) {
        head = head.next;

        if (head == null) {
            tail = null;
        }

        return;
    }

    // Dono ko saath move karo
    while (fast.next != null) {
        slow = slow.next;
        fast = fast.next;
    }

    // Delete node
    slow.next = slow.next.next;

    // Agar last node delete hui ho
    if (slow.next == null) {
        tail = slow;
    }
}

    public static void main(String[] args) {

        deleteNthEnd list = new deleteNthEnd();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        System.out.println("Before Deleting 3rd Node from End:");
        list.display();

      
        System.out.println("After Deleting 3rd Node from End:");
        list.deleteNthFromLastUsingTwoPointers(1);
        list.display();
    }
}