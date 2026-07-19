import java.util.*;

public class InfixToPrefix {

    public static void main(String[] args) {

        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        String str = "9-(5+3)*4/6";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Ignore spaces
            if (ch == ' ')
                continue;

            // Operand
            if (Character.isDigit(ch)) {
                val.push(ch + "");
            }

            // Opening bracket
            else if (ch == '(') {
                op.push(ch);
            }

            // Closing bracket
            else if (ch == ')') {

                while (op.peek() != '(') {

                    String v2 = val.pop();
                    String v1 = val.pop();

                    char opr = op.pop();

                    String ans = opr + v1 + v2;

                    val.push(ans);
                }

                op.pop(); // remove '('
            }

            // Operator
            else {

                while (!op.isEmpty() &&
                        op.peek() != '(' &&
                        precedence(op.peek()) >= precedence(ch)) {

                    String v2 = val.pop();
                    String v1 = val.pop();

                    char opr = op.pop();

                    String ans = opr + v1 + v2;

                    val.push(ans);
                }

                op.push(ch);
            }
        }

        // Remaining operators
        while (!op.isEmpty()) {

            String v2 = val.pop();
            String v1 = val.pop();

            char opr = op.pop();

            String ans = opr + v1 + v2;

            val.push(ans);
        }

        System.out.println("Prefix = " + val.peek());
    }

    // Operator Priority
    public static int precedence(char op) {

        if (op == '+' || op == '-')
            return 1;

        if (op == '*' || op == '/')
            return 2;

        return 0;
    }
}