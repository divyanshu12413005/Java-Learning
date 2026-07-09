
import java.util.Stack;

public class InsertAtIndx {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Original stack: " + st);
        int index = 2; // Index at which to insert the new element
        int newElement = 25; // New element to be inserted

       // Create a temporary stack to hold elements above the specified index
        Stack<Integer> tempStack = new Stack<>();
       while (st.size() > index) {
            tempStack.push(st.pop());
        }

        // Push the new element onto the original stack
        st.push(newElement);

        // Push the elements back from the temporary stack to the original stack
        while (!tempStack.isEmpty()) {
            st.push(tempStack.pop());
        }

        System.out.println("Stack after insertion: " + st);
    }
}
