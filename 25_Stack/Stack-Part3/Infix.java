import java.util.*;

public class Infix {

    // Function to perform operation
    public static void calculate(Stack<Integer> val, Stack<Character> op) {

        int v2 = val.pop();
        int v1 = val.pop();
        char opr = op.pop();

        if (opr == '+')
            val.push(v1 + v2);

        if (opr == '-')
            val.push(v1 - v2);

        if (opr == '*')
            val.push(v1 * v2);

        if (opr == '/')
            val.push(v1 / v2);
    }

    public static void main(String[] args) {

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        String str = "9-(5+3)*4/6";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int ascii = (int) ch;

            // Number
            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            }

            // Opening Bracket
            else if (ch == '(') {
                op.push(ch);
            }

            // Closing Bracket
            else if (ch == ')') {

                while (op.peek() != '(') {
                    calculate(val, op);
                }

                op.pop(); // remove '('
            }

            // First Operator
            else if (op.isEmpty() || op.peek() == '(') {
                op.push(ch);
            }

            // + or -
            else if (ch == '+' || ch == '-') {

                while (!op.isEmpty() && op.peek() != '(') {
                    calculate(val, op);
                }

                op.push(ch);
            }

            // * or /
            else {

                while (!op.isEmpty() &&
                        op.peek() != '(' &&
                        (op.peek() == '*' || op.peek() == '/')) {

                    calculate(val, op);
                }

                op.push(ch);
            }
        }

        // Remaining operators
        while (!op.isEmpty()) {
            calculate(val, op);
        }

        System.out.println("Answer = " + val.peek());
    }
}