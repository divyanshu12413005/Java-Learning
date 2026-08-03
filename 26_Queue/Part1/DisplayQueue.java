import java.util.*;

public class DisplayQueue {

    public static void main(String[] args) {

        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Queue<Integer> q2 = new ArrayDeque<>();

        while (!q.isEmpty()) {

            int x = q.poll();
            System.out.println(x);
            q2.add(x);
        }

        while (!q2.isEmpty()) {
            q.add(q2.poll());
        }

        System.out.println(q);
    }
}