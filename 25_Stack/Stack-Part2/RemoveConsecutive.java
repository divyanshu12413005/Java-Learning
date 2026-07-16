import java.util.*;

public class RemoveConsecutive {

    public static int[] remove(int arr[]) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {

                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }

            } else {
                st.push(arr[i]);
            }
        }

        int[] res = new int[st.size()];

        for (int i = st.size() - 1; i >= 0; i--) {
            res[i] = st.pop();
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,2,3,10,10,10,4,4,5,2,7,2};

        int[] ans = remove(arr);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}