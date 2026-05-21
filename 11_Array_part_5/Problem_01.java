

public class Problem_01 {
    static void sortedArray(int[] arr){
        int zeroes=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                zeroes++;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(i<zeroes){
                arr[i]=0;
            }else{
                arr[i]=1;
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
