

public class Problem_02 {
    static void sortedArray(int[] arr){
        int left=0, right=arr.length-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;

        }
        if(arr[left]==0){
            left++;
          
        }
        if(arr[right]==1){
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
        int arr[]={1,0,1,0,0,1,0,1,1};
        System.out.println("Original Array:");
        printArray(arr);
        System.out.println("Sorted Array:");
        sortedArray(arr);
        printArray(arr);
    }
    

    
}
