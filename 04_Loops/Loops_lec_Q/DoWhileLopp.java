import java.util.Scanner;
public class DoWhileLopp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
      do { 
          System.out.println(num);
          num++;
      } while (num<=n);

        
    }
    
}
