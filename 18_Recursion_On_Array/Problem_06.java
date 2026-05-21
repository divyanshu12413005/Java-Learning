import java.util.Scanner;

public class Problem_06 {
    static int  SumOfArr(int[] arr, int idx){
        if(idx==arr.length-1) return arr[idx];
        
        // int smallAns=SumOfArr(arr, idx+1);
        // return (arr[idx]+smallAns );
        return SumOfArr(arr, idx+1)+arr[idx];

    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        int idx=0;
        for (int i = 0; i < n; i++) {
             arr[i]=sc.nextInt();
              }
           System.out.println(SumOfArr(arr, idx));
        }
    
}
