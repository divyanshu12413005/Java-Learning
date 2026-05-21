public class Problem_06 {
    static void subsetSum(int[] a, int n, int idx, int sum){
        if(idx>=n){
            System.out.println(sum);
            return;
        }
        subsetSum(a, n, idx+1, sum+a[idx]);
        subsetSum(a, n, idx+1, sum);
    }
    public static void main(String[] args) {
        int[] a={2,5};
        subsetSum(a, a.length, 0, 0);
    }
    
}
