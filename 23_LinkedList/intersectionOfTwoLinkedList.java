public class intersectionOfTwoLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Length nikalne ka method
    public static int length(Node head) {

        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }

    // Intersection find karne ka method
    public static Node getIntersectionNode(Node headA, Node headB) {

        int lenA = length(headA);
        int lenB = length(headB);

        Node tempA = headA;
        Node tempB = headB;

        // Longer list ko aage le jao
        if (lenA > lenB) {

            int diff = lenA - lenB;

            while (diff > 0) {
                tempA = tempA.next;
                diff--;
            }

        } else {

            int diff = lenB - lenA;

            while (diff > 0) {
                tempB = tempB.next;
                diff--;
            }
        }

        // Dono ko saath move karo
        while (tempA != null && tempB != null) {

            if (tempA == tempB) {
                return tempA;
            }

            tempA = tempA.next;
            tempB = tempB.next;
        }

        return null;
    }

    public static void main(String[] args) {

        // Common Part
        Node common1 = new Node(8);
        Node common2 = new Node(4);
        Node common3 = new Node(5);

        common1.next = common2;
        common2.next = common3;

        // List A
        Node headA = new Node(4);
        headA.next = new Node(1);
        headA.next.next = common1;

        // List B
        Node headB = new Node(5);
        headB.next = new Node(6);
        headB.next.next = new Node(1);
        headB.next.next.next = common1;

        Node intersection = getIntersectionNode(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection Node = " + intersection.data);
        } else {
            System.out.println("No Intersection");
        }
    }
}