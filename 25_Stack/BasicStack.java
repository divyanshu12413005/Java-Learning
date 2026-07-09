import java.util.Stack;
public class BasicStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        //peek
        System.out.println("Top element is: " + st.peek());
        //print all elements
        System.out.println("Stack elements are: " + st);

        //pop
        System.out.println("Popped element is: " + st.pop());
        
        System.out.println("Stack elements after pop are: " + st);

        //size of stack
        System.out.println("Size of stack is: " + st.size());

        //reverse the stack
        Stack<Integer> reversedStack = new Stack<>();
        while (st.size() > 0) {
            reversedStack.push(st.pop());
        }
        System.out.println("Reversed stack is: " + reversedStack);
    }
}
