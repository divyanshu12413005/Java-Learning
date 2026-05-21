

import java.util.Scanner;

public class Selection_Sort {

    static void selectionSort(int[] arr){
        int l= arr.length;
        //n-1 iteration 
        for (int i = 0; i <l-1; i++) {
            //Find the minimum element in unsorted part of array
            int min_index=i;
            for(int j=i+1; j<l; j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                    
                }
                //swap current element and manimum element
                int temp= arr[i];
                arr[i]=arr[min_index];
                arr[min_index]= temp;
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
    selectionSort(arr);
    for(int i: arr){
        System.out.print(i+" ");
    }

    
}
}
