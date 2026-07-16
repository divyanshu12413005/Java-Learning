import java.util.*;

public class BalanceBrackets {

    public boolean isBalanced(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }

            else {

                if (stack.isEmpty()) {
                    return false;
                }

                switch (c) {

                    case ')':
                        if (stack.pop() != '(')
                            return false;
                        break;

                    case ']':
                        if (stack.pop() != '[')
                            return false;
                        break;

                    case '}':
                        if (stack.pop() != '{')
                            return false;
                        break;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Brackets: ");

        String str = sc.nextLine();

        BalanceBrackets obj = new BalanceBrackets();

        System.out.println(obj.isBalanced(str));
    }
}