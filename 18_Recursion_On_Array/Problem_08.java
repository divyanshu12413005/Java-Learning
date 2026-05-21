import java.util.Scanner;

public class Problem_08 {


    static void findIndex(int[]arr,int x, int idx){
        if(idx>=arr.length) return;


        if(arr[idx]==x) 
        System.out.print(idx+" ");
        
         findIndex(arr,x, idx+1);

    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int n= sc.nextInt();
        int arr[]= new int[n];
        int idx=0;

        for (int i = 0; i < n; i++) {
             arr[i]=sc.nextInt();
              }
          
           

           findIndex(arr, x, idx);
        }
    
}
