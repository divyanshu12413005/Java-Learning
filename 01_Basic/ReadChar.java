import java.util.Scanner;
public class ReadChar {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Character:");
            char ch=sc.next().charAt(2);
            System.out.println("Character is:"+ch);
        }

    }
}
