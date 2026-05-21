

public class Problem_03 {
    static  int[] reverseArray(int [] arr){
        int[] ans=new int[arr.length];
        int j=0;
        for(int i=arr.length-1; i>=0; i--){
            ans[j]=arr[i];
            j++;
        }
        return ans;

    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.print("Original Array: ");
        printArray(arr);
        int[] ans=reverseArray(arr);
        System.out.print("Reversed Array: ");
        printArray(ans);
    }
    
}
