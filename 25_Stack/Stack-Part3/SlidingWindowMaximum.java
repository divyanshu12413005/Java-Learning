import java.util.*;

public class SlidingWindowMaximum {

    public static void main(String[] args) {

        int nums[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        int ans[] = maxSlidingWindow(nums, k);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] maxSlidingWindow(int nums[], int k) {

        int n = nums.length;

        int[] ans = new int[n - k + 1];

        Stack<Integer> st = new Stack<>();

        int[] nge = new int[n];

        // Next Greater Element
        st.push(n - 1);
        nge[n - 1] = n;

        for (int i = n - 2; i >= 0; i--) {

            while (!st.isEmpty() && nums[i] >= nums[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty())
                nge[i] = n;
            else
                nge[i] = st.peek();

            st.push(i);
        }

        int j = 0;

        for (int i = 0; i <= n - k; i++) {

            if (j < i)
                j = i;

            while (nge[j] < i + k) {
                j = nge[j];
            }

            ans[i] = nums[j];
        }

        return ans;
    }
}