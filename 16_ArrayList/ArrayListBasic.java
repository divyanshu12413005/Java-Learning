import java.util.ArrayList;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> L1 = new ArrayList<>();

        //add new elements
        L1.add(5);
        L1.add(6);
        L1.add(7);
        L1.add(8);

        //get elements at index
        System.out.println(L1.get(2));

        //print with for loop
        for(int i=0; i<L1.size(); i++){
            System.out.print(L1.get(i)+ " ");
        }
        System.out.println();

        //printing the arraylist directly
        System.out.println(L1);

        //adding element at some index
        L1.add(1, 50);
        System.out.println(L1);

        //modifying elements at some index
        L1.set(2, 50);

        //removing an element at index
        L1.remove(1);
        System.out.println(L1);

        //removing an element e
        L1.remove(Integer.valueOf(8));
        System.out.println(L1);

        //checking if an element exists
        boolean ans=L1.contains(Integer.valueOf(100));
        System.out.println(ans);

        //if you don not specify class, you can put anything inside L
         ArrayList L = new ArrayList();
         L.add("pqrs");
         L.add(1);
         L.add(true);
         System.out.println(L);




        
    }
    
}
