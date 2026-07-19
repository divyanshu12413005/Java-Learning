import java.util.*;

public class PostfixToInfix {

    public static void main(String[] args) {

        String str = "953+4*6/-";

        Stack<String> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

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

                String ans =  "(" + v2 + ch + v1 + ")";

                st.push(ans);
            }
        }

        System.out.println("Infix = " + st.peek());
    }
}