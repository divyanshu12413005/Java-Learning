// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class WapEvenDivi3 {
  

   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number:");
      int num = sc.nextInt();
      if(num % 2==0 && num%3==0){
         System.out.println(num);
      }
      else{
         System.out.println("Invalid number!");
      }
     

   }
}
