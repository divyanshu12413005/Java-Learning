import java.util.Scanner;

public class Problem_05 {
    static int  PrintMaxArr(int[] arr, int idx){
        if(idx==arr.length-1) return arr[idx];
        
        int smallAns=PrintMaxArr(arr, idx+1);
        return Math.max(arr[idx],smallAns );

    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        int idx=0;
        for (int i = 0; i < n; i++) {
             arr[i]=sc.nextInt();
              }
           System.out.println(PrintMaxArr(arr, idx));
        }
    
}
