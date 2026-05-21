import java.util.Scanner;

public class Problem_02 {


    static String ReverseString(String st,int idx){
        if(idx==st.length()) return "";

    //   String smallAns= ReverseString(st, idx+1);
    //   return smallAns+st.charAt(idx);
    return ReverseString(st, idx+1)+st.charAt(idx);
     
      
         

    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       
        String st=sc.nextLine();
        int idx=0;

       System.out.println(ReverseString(st,idx));
        }
    
}
