import java.util.*;

public class LargestRectangleHistogram {

    public static int largestRectangleArea(int[] heights) {

        int n = heights.length;

        int[] nse = new int[n];
        int[] pse = new int[n];

        Stack<Integer> st = new Stack<>();

        // Next Smaller Element (Right Side)

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                nse[i] = n;
            } else {
                nse[i] = st.peek();
            }

            st.push(i);
        }

        // Empty Stack
        st.clear();

        // Previous Smaller Element (Left Side)

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                pse[i] = -1;
            } else {
                pse[i] = st.peek();
            }

            st.push(i);
        }

        // Maximum Area

        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            int width = nse[i] - pse[i] - 1;

            int area = heights[i] * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {

        int heights[] = {2,1,5,6,2,3};

        int ans = largestRectangleArea(heights);

        System.out.println("Maximum Rectangle Area = " + ans);
    }
}