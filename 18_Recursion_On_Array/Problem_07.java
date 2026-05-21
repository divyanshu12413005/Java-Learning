import java.util.Scanner;

public class Problem_07 {
    
     static boolean SearchingOfArr(int[] arr,int x, int idx){
        if(idx>=arr.length) return false;


        if(arr[idx]==x) return true;
        
        
      return  (SearchingOfArr(arr,x, idx+1));
      
      
                                  


    }

    // search the element and give the index of the searched element if present otherwise -1

    static int searchIndex(int[]arr,int x, int idx){
        if(idx>=arr.length) return -1;


        if(arr[idx]==x) return idx;
          return searchIndex(arr,x, idx+1);

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
          
            if ( SearchingOfArr(arr,x,idx)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

            System.out.println(searchIndex(arr, x, idx));
        }
    
}
