public class Problem_05 {

    //duplecate elements
    static boolean search_(int[] a, int target) {
        int n = a.length;
        int st = 0, end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (a[mid] == target) {
                return true;
            }
            else if (a[st]==a[mid] && a[end]==a[mid]) {
                st++;
                end--;
            }
            
            else if (a[mid]<=a[end]) { // right half is sorted
                if (target > a[mid] && target <= a[end]) {
                    st = mid + 1; // target is in the right half
                } else {
                    end = mid - 1; // target is in the left half
                }
            } else {    // left half is sorted
                if (target >= a[st] && target < a[mid]) {
                    end = mid - 1; // target is in the left half
                } else {
                    st = mid + 1; // target is in the right half
                }
            }
        }
            return false; // element not found
        }

    public static void main(String[] args) {
        int[] a = {0,0,0,1,1,1,2,0,0,0};
        int target = 2;
        boolean result = search_(a, target);
        System.out.println(result);
    }
    
}
