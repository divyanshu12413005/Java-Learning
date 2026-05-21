import java.util.Scanner;

public class Problem_01 {


    static String RemoveGivenString(String st,String x, int idx){
        if(idx==st.length()) return " ";

      String smallAns= RemoveGivenString(st, x, idx+1);
      char current=st.charAt(idx);
      if(current != x.charAt(0)) {
          return current + smallAns;
      } else {
          return smallAns;
      }
      
         

    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String x = sc.nextLine();
        String st=sc.nextLine();
        int idx=0;

       System.out.println(RemoveGivenString(st, x, idx));
        }
    
}
