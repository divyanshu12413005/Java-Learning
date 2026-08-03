
import  java .util.*;


public class BasicSTL {

    public static void main(String[] args) {


        Queue<Integer> q = new ArrayDeque<>();   

        //or

        //Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);


        System.out.println(q);

        System.out.println(q.peek());    // or use element() method  for getting the first element
        
        q.remove();     // or use poll() method for removing
        System.out.println(q);  


        //size
        System.out.println(q.size());

    }
    
}
