public class insertAtIndex {

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

    // Add at Last
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

    // Insert at Any Index
    public void insertAtIndex(int index, int data) {

         if(index < 0){
        System.out.println("Invalid Index");
        return;
    }


        Node newNode = new Node(data);

        // Insert at beginning
        if (index == 0) {

            newNode.next = head;
            head = newNode;

            if (tail == null) {
                tail = newNode;
            }

            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {

               // Check if temp is null (index out of bounds) this is inside the loop to handle cases where index is greater than list size

                if (temp == null) {
                    System.out.println("Index out of bounds");
                    return;
                }
            temp = temp.next;
        }
        

        // Check if temp is null (index out of bounds) this is outside the loop to handle cases where index is exactly one more than list size (inserting at end)
            if (temp == null) {
                System.out.println("Index out of bounds");
                return;
            }

        newNode.next = temp.next;
        temp.next = newNode;

        // If inserted at end
        if (newNode.next == null) {
            tail = newNode;
        }
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

    public static void main(String[] args) {

        insertAtIndex list = new insertAtIndex();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println("Before Insertion:");
        list.display();

        list.insertAtIndex(2, 25);
        list.insertAtIndex(-15, 5); // Invalid Index
        list.insertAtIndex(10, 60); // Index out of bounds
      
        System.out.println("After Insertion:");
        list.display();
    }
}