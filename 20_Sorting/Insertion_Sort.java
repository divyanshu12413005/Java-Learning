

import java.util.Scanner;

public class Insertion_Sort {

    static void insertionSort(int[] arr){
        int l= arr.length;
        //n-1 iteration 
        for (int i = 1; i <l; i++) {
           int j=i;
           while(j>0 && arr[j]<arr[j-1]){
            //swap arr[j] and arr[j-1]
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;
                    j--;

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
    insertionSort(arr);
    for(int i: arr){
        System.out.print(i+" ");
    }

}
}

