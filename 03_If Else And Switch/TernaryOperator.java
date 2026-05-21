// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class TernaryOperator {
   
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
     
      int var2 = var1.nextInt();
      String ans;
      ans = (var2 % 2 == 0) ? "Even" : "Odd";
      System.out.println( ans );

   }
}
