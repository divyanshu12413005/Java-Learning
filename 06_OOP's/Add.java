
import java.util.Scanner;

class Algebra{
    int add(int a, int b){
        int ans=a+b;
        return ans;
    }
}
public class Add{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Algebra obj=new Algebra();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int result=obj.add(x, y);
        System.out.println("Sum of " + x + " and " + y + " is: " + result);
    }
}