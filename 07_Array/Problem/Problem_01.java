public class Problem_01 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3};
        int sum = 0;

        // Using a for-each loop 
        for (int num : arr) {
            sum += num; 
        }

        System.out.println("Sum of the array elements is: " + sum);
    }
}
