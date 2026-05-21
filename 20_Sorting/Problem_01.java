

import java.util.Scanner;

public class Problem_01 {

    static void moveZeros(int[] arr){
        int l= arr.length;
        //n-1 iteration 
        for (int i = 0; i <l-1; i++) {
            for(int j=0; j<l-i-1; j++){
                if(arr[j]==0 && arr[j+1] !=0){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;

                }
            }
            
        }
    }

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]=new int[n];
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    moveZeros(arr);
    for(int i: arr){
        System.out.print(i+" ");
    }

    
}
}
