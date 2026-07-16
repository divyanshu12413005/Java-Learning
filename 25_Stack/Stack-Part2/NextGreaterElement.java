import java.util.*;

public class NextGreaterElement {

    public static int[] nextGreater(int arr[]) {

        int n = arr.length;
        int ans[] = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {1,3,2,1,8,6,3,4};

      int[] ans = nextGreater(arr);

    for (int x : ans) {
    System.out.print(x + " ");
  }
    }
}