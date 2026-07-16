import java.util.*;

public class MinimumBracketRemove {

    public static int minRemove(String str) {

        Stack<Character> st = new Stack<>();
        int remove = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(') {
                st.push(ch);
            }

            else if (ch == ')') {

                if (!st.isEmpty()) {
                    st.pop();
                } else {
                    remove++;
                }
            }
        }

        remove += st.size();

        return remove;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Brackets: ");
        String str = sc.nextLine();

        System.out.println("Minimum Removals = " + minRemove(str));
    }
}