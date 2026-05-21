public class LogicalOperators{
    public static void main(String[] args) {
        int p=15,q=10,r=5;
        //&& (Logical AND)
        System.out.println((p>q)&&(p>r));
        System.out.println((p>q)&&(p<r));
        

        // ||(Logical OR)
        System.out.println((r<q)||(p>q));
        System.out.println((p>q)||(q<r));
        System.out.println((p<q)||(q<r));

        // !(Logical NOT)
        System.out.println(!(p==q));
        System.out.println(!(p>q));

    }
}