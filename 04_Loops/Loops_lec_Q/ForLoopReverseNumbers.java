import java.util.Scanner;
public class ForLoopReverseNumbers{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
       for(int num=n; num>0; num--){
        System.out.println(num);
       }


        
    }
    
}
