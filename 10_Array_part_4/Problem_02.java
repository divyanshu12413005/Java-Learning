

public class Problem_02 {
    static void Swap(int a, int b){
        System.out.println("Before Swap: " + a + " " +b);
       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println("After Swap: " + a +" "+ b);

    }
    public static void main(String[] args) {
        int a=9;
        int b=3;
        Swap(a,b);
    }
    
}
