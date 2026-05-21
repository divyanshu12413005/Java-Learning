

public class Problem_01 {
    static void Swap(int a, int b){
        System.out.println("Before Swap: " + a + " " +b);
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap: " + a +" "+ b);

    }
    public static void main(String[] args) {
        int a=9;
        int b=3;
        Swap(a,b);
    }
    
}
