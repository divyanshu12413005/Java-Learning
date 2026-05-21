
import java.util.Scanner;

public class Problem_03 {

    static void displayArr(int[] arr){
        for(int val:arr){
            System.out.print(val + " ");
            //System.out.println();
        }
    }
    static void sortArr(int[] arr){
        int n= arr.length;
        int x=-1, y=-1;
        if(n<=1){   //corner case,edge case 
            return;
        }
        //process all adjacent elements
        for(int i=1; i<n-1; i++){
            if(arr[i-1]>arr[i]){ 
                if(x == -1){ //first time we found a pair
                    x = i-1; 
                    y= i;
                } else { //second time we found a pair
                    y = i;
                }
              
               
            }
        }
        //swap x and y in arr
        int temp = arr[x];
        arr[x] = arr[y];    
        arr[y] = temp;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    
    sortArr(arr);
    displayArr(arr);


    }

}
