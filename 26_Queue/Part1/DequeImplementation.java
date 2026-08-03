import java.util.*;

public class DequeImplementation {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(20);
        dq.addFirst(10);

        dq.addLast(30);
        dq.addLast(40);

        System.out.println(dq);

        System.out.println(dq.removeFirst());

        System.out.println(dq.removeLast());

        System.out.println(dq);

        System.out.println(dq.peekFirst());

        System.out.println(dq.peekLast());

    }
}