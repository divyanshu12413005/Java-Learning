public class Problem_01 {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
     static  void makePrefixSumArray(int [] arr){
      int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i] = arr[i-1] + arr[i];
        }
        printArray(arr);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Original Array:");
        printArray(arr);
        System.out.println("Prefix Sum Array:");
       
        makePrefixSumArray(arr);
     

    }
}

