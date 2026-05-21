import java.util.ArrayList;

public class ReverseArrayList {

    static void reverseList(ArrayList<Integer>List){
        int i=0, j=List.size()-1;
        while(i<j){
            Integer temp=Integer.valueOf(List.get(i));
            List.set(i, List.get(j));
            List.set(j, temp);
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> L1 = new ArrayList<>();

        //add new elements
        L1.add(5);
        L1.add(6);
        L1.add(7);
        L1.add(8);
        L1.add(9);
        L1.add(1);
        L1.add(0);
        L1.add(3);
        System.out.println("Original Array List:"+ L1);

        reverseList(L1);
        System.out.println("Reversed Array List:" + L1);

    }
}