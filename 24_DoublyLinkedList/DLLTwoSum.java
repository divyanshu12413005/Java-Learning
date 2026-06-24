public class DLLTwoSum {

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

    public boolean twoSum(int target) {

        Node left = head;
        Node right = tail;

        while (left != right && left.prev != right) {

            int sum = left.data + right.data;

            if (sum == target) {
                System.out.println(
                    left.data + " + " + right.data + " = " + target
                );
                return true;
            }

            else if (sum < target) {
                left = left.next;
            }

            else {
                right = right.prev;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        DLLTwoSum dll = new DLLTwoSum();

        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(4);
        dll.addLast(5);
        dll.addLast(6);
        dll.addLast(8);

        System.out.println(dll.twoSum(10));
    }
}