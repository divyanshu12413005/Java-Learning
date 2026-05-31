public class Problem_06 {
    static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int st = 0, end = m * n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            int midValue = matrix[mid / m][mid % m];
            if (midValue == target) {
                return true; // target found
            } else if (midValue < target) {
                st = mid + 1; // search in the right half
            } else {
                end = mid - 1; // search in the left half
            }
        }
        return false; // target not found
    }

    public static void main(String[] args) {
       
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;
        boolean result =searchMatrix(matrix, target);
        System.out.println(result); // Output: true
    }
}
