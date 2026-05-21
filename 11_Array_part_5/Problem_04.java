public class Problem_04 {

     static  void reverseArray(int [] arr){
       int i=0;
       int j=arr.length-1;
         while(i<j){
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
              i++;
              j--;
         }
        }
    static int[] squareOfArray(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = 0; // Fill from beginning for decreasing order

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
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
        int arr[] = {1, 2, -3, 9, -10, -6, 7, 8, 5};
        System.out.println("Original Array:");
        printArray(arr);
        System.out.println("Square of Array Elements (decreasing order):");
        int[] ans = squareOfArray(arr);
        
        reverseArray(ans);
        printArray(ans);

    }
}

