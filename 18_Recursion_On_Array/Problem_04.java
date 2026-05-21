import java.util.Scanner;

public class Problem_04 {
    static void  PrintArr(int[] arr, int idx){
        if(idx==arr.length) return;
        System.out.print(arr[idx]+" ");
        PrintArr(arr, idx+1);

    }
   public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        int idx=0;
        for (int i = 0; i < n; i++) {
             arr[i]=sc.nextInt();
              }
            PrintArr(arr, idx);
        }
    
}
