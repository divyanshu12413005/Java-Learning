

public class Problem_03 {
    static void sortedArray(int[] arr){
        int left=0, right=arr.length-1;
        while(left<right){
            if(arr[left]%2!=0 && arr[right]%2==0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;

        }
        if(arr[left]%2==0){
            left++;
          
        }
        if(arr[right]%2!=0){
            right--;
       
        }
    }
        


    }
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original Array:");
        printArray(arr);
        System.out.println("Sorted Array:");
        sortedArray(arr);
        printArray(arr);
    }
    

    
}
