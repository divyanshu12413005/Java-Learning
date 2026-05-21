  import java.util.Scanner;

public class Problem_03_method_2 {

    static boolean  isPalindrome(String st, int left,int right) {
        // Base case: if the index reaches the length of the string, return an empty string
        if (left>=right) return true;

        // Recursive call to get the reversed string from the rest of the string
        return (st.charAt(left)==st.charAt(right) && isPalindrome(st,left+1,right-1));
    }

   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine(); // Input string
        int left=0;
        int right=st.length()-1;

        System.out.println(isPalindrome(st,left,right));

        
    }
}

    

