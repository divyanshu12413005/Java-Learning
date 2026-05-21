

class Question {  // Corrected class name to follow Java conventions (PascalCase)
    static boolean  IsSorted(int[] arr) {
        boolean check = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                check = false;
                break;
            }
        }
        return check;
    }
       
}

public class Problem_04 { // Corrected class name to follow Java conventions (PascalCase)
    public static void main(String[] args) {
       

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 15;

      

        boolean sorted = Question.IsSorted(arr);
        System.out.println("The array is sorted: " + sorted);
        
    }
}
