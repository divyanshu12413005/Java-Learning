public class Basic01 {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
  
    // display the linked list from head to tail
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
  
    // display the linked list from tail to head
    public static void displayReverse(Node tail){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
    }


    // display the linked list from head to tail given a random node in the linked list
    public static void display2(Node random){
        Node temp = random;

        //move this temp backwards to the head of the linked list
        while(temp.prev != null){
            temp = temp.prev;
        }

        //now display the linked list from head to tail

        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    // insert a new node at head of the linked list
    public static Node insertAtHead(Node head, int val){
        Node newNode = new Node(val);
        newNode.next = head;
        if(head != null){
            head.prev = newNode;
        }
        return newNode;
    }

    // insert a new node at tail of the linked list
    public static void insertAtTail(Node head, int val){
        Node newNode = new Node(val);
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        
    }

    // insert a new node at a given position in the linked list
    public static void  insertAtPosition(Node head, int pos, int val){
        Node t = new Node(val);
        
        Node s = head;
        for(int i=1; i<=pos-1 && s != null; i++){
            s = s.next;
        }
        Node r=s.next;
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
       
    }

    // delete a node at a head in the linked list
    public static Node deleteAtHead(Node head){
        if(head == null){
            return null;
        }
        Node newHead = head.next;
        if(newHead != null){
            newHead.prev = null;
        }
        return newHead;
    }

    // delete a node at a tail in the linked list
    public static void deleteAtTail(Node head){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node prevNode = temp.prev;
        if(prevNode != null){
            prevNode.next = null;
        }
    }

    // delete a node at a given position in the linked list
    public static void deleteAtPosition(Node head, int pos){
        if(head == null){
            return;
        }
        Node temp = head;
        for(int i=1; i<=pos-1 && temp != null; i++){
            temp = temp.next;
        }
        if(temp == null || temp.next == null){
            return;
        }
        Node nodeToDelete = temp.next;
        Node nextNode = nodeToDelete.next;
        temp.next = nextNode;
        if(nextNode != null){
            nextNode.prev = temp;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.prev = null;

        a.next = b;
        b.prev = a;

        b.next = c;
        c.prev = b;

        c.next = d;
        d.prev = c;

        d.next = null;

        // display(a);
        // System.out.println();
        // displayReverse(d);

        // System.out.println();
        // display2(c);

        // System.out.println();
        // Node newHead = insertAtHead(a, 5);
        // display(newHead);

        // System.out.println();
        // insertAtTail(a, 50);
        // display(a);

            System.out.println();
            // insertAtPosition(a, 3, 25);
            // display(a);

           
            // Node newHead = deleteAtHead(a);
            // display(newHead);

            // deleteAtTail(a);
            // display(a);

            deleteAtPosition(a, 2);
            display(a);
    }



}
