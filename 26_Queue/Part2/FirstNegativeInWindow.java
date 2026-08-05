import java.util.*;

public class FirstNegativeInWindow {

    public static void main(String[] args) {

        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;

        ArrayList<Integer> ans = firstNegative(arr, k);

        System.out.println(ans);
    }

    public static ArrayList<Integer> firstNegative(int[] arr, int k) {

        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            // Add negative index
            if (arr[i] < 0) {
                q.add(i);
            }

            // Remove out of window index
            while (!q.isEmpty() && q.peek() <= i - k) {
                q.remove();
            }

            // Window completed
            if (i >= k - 1) {

                if (q.isEmpty()) {
                    ans.add(0);
                } else {
                    ans.add(arr[q.peek()]);
                }
            }
        }

        return ans;
    }
}