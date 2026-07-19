import java.util.*;

public class InfixToPostfix {

    public static int precedence(char op) {

        if (op == '+' || op == '-')
            return 1;

        if (op == '*' || op == '/')
            return 2;

        return 0;
    }

    public static void solve(Stack<String> val, Stack<Character> op) {

        String v2 = val.pop();
        String v1 = val.pop();
        char opr = op.pop();

        String ans = v1 + v2 + opr;

        val.push(ans);
    }

    public static void main(String[] args) {

        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        String str = "9-(5+3)*4/6";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {

                val.push(ch + "");

            }

            else if (ch == '(') {

                op.push(ch);

            }

            else if (ch == ')') {

                while (op.peek() != '(') {
                    solve(val, op);
                }

                op.pop();
            }

            else {

                while (!op.isEmpty() &&
                        op.peek() != '(' &&
                        precedence(op.peek()) >= precedence(ch)) {

                    solve(val, op);
                }

                op.push(ch);
            }
        }

        while (!op.isEmpty()) {
            solve(val, op);
        }

        System.out.println("Postfix = " + val.peek());
    }
}