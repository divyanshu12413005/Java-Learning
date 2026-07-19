import java.util.*;

public class PrefixToInfix {

    public static void main(String[] args) {

        String str = "-9/*+5346";

        Stack<String> st = new Stack<>();

        for (int i = str.length() - 1; i >= 0; i--) {

            char ch = str.charAt(i);
            int ascii = (int) ch;

            // Operand
            if (ascii >= 48 && ascii <= 57) {
                st.push(ch + "");
            }

            // Operator
            else {

                String v1 = st.pop();
                String v2 = st.pop();

                String ans = "(" + v1 + ch + v2 + ")";

                st.push(ans);
            }
        }

        System.out.println("Infix = " + st.peek());
    }
}