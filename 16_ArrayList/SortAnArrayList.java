

import java.util.ArrayList;
import java.util.Collections;
public class SortAnArrayList {


    public static void main(String[] args) {
        ArrayList<String> L1 = new ArrayList<>();

        //add new elements
        L1.add("Divyanshu");
        L1.add("Singh");
        L1.add("Chauhan");

        Collections.sort(L1);
        System.out.println("Ascending Order:"+ L1);

        Collections.sort(L1,Collections.reverseOrder());
        System.out.println("dscending Order:"+ L1);
       
    
}
}
