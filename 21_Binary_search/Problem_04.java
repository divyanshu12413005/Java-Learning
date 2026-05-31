public class Problem_04 {
    static int search(int[] a, int target) {
        int n = a.length;
        int st = 0, end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (a[mid] == target) {
                return mid; 

            } else if (a[mid]<a[end]) { // right half is sorted
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
            return -1; // element not found
        }

        public static void main(String[] args) {
            int[] a = {3,4,5,1,2};
            int target = 4;
            int result = search(a, target);
            System.out.println(result);
        }
    }

