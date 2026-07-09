import java.util.Stack;

public class RemoveAnyIdx {

    public static void removeAt(Stack<Integer> st, int index) {


  
        Stack<Integer> temp = new Stack<>();

        // Move elements above target
        while (index-- > 0) {
            temp.push(st.pop());
        }
        //or 
        //  while (st.size() > index + 1) {
        //     temp.push(st.pop());
        // }

        // Remove target element
        st.pop();

        // Put elements back
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Before : " + st);

        removeAt(st, 2);

        System.out.println("After  : " + st);
    }
}