

public class Continuestatement {
    public static void main(String[] args) {
        for(int num=1; num<=50; num++){
            if(num%3==0){
                continue; // Skip the rest of the loop iteration if the number is divisible by 3
            }
            System.out.println(num);
        }
    }
    
}
