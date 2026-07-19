import java.util.*;

public class CelebrityProblem {

    public static int celebrity(int M[][], int n) {

        Stack<Integer> st = new Stack<>();

        // Step 1: Push all persons
        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        // Step 2: Find candidate
        while (st.size() > 1) {

            int a = st.pop();
            int b = st.pop();

            if (M[a][b] == 1) {
                // a knows b
                // a cannot be celebrity
                st.push(b);
            } else {
                // a doesn't know b
                // b cannot be celebrity
                st.push(a);
            }
        }

        // Step 3: Final candidate
        int c = st.pop();

        // Step 4: Verify candidate
        for (int i = 0; i < n; i++) {

            if (i != c) {

                if (M[c][i] == 1 || M[i][c] == 0) {
                    return -1;
                }

            }
        }

        return c;
    }

    public static void main(String[] args) {

        int[][] M = {
                {0, 1, 0},
                {0, 0, 0},
                {0, 1, 0}
        };

        int ans = celebrity(M, M.length);

        if (ans == -1)
            System.out.println("No Celebrity");
        else
            System.out.println("Celebrity is : " + ans);
    }
}