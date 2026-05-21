import java.util.Scanner;

public class  Problem_03 {
    static int findArraySum(int[] arr){
        int totalSum = 0;
        for(int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int[] arr){
        int totalSum=findArraySum(arr);
        int prefSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            int sufixSum = totalSum - prefSum;
            if (prefSum == sufixSum) {
                return true;
            }
           }
           return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for(int i = 0; i <n; i++){
            arr[i] = sc.nextInt();
        }

        boolean result = equalSumPartition(arr);
        System.out.println("Is there a partition with equal sum? " + result);
        sc.close();
        
       
         }

        

      
    }
