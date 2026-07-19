import java.util.Stack;

public class MinStack {

    Stack<Long> st = new Stack<>();
    long min;

    // Push
    public void push(int val) {

        if (st.isEmpty()) {
            st.push((long) val);
            min = val;
        }

        else if (val >= min) {
            st.push((long) val);
        }

        else {
            st.push(2L * val - min);   // Store encoded value
            min = val;                 // Update minimum
        }
    }

    // Pop
    public void pop() {

        if (st.isEmpty()) {
            return;
        }

        long top = st.pop();

        if (top < min) {
            min = 2 * min - top;      // Restore previous minimum
        }
    }

    // Top
    public int top() {

        long top = st.peek();

        if (top >= min) {
            return (int) top;
        }

        return (int) min;
    }

    // Get Minimum
    public int getMin() {
        return (int) min;
    }

    public static void main(String[] args) {

        MinStack ms = new MinStack();

        ms.push(5);
        ms.push(3);
        ms.push(7);
        ms.push(2);

        System.out.println("Top = " + ms.top());
        System.out.println("Min = " + ms.getMin());

        ms.pop();
        System.out.println("\nAfter Pop");

        System.out.println("Top = " + ms.top());
        System.out.println("Min = " + ms.getMin());

        ms.pop();
        System.out.println("\nAfter Pop");

        System.out.println("Top = " + ms.top());
        System.out.println("Min = " + ms.getMin());
    }
}