

public class BreakStatement {
    public static void main(String[] args) {
       // int num=1;
    //     while (true) { 
    //         if(num%5==0 && num%7==0){
    //             System.out.println("Found:"+ num);
    //             break; // Exit the loop when a number is found that is divisible by both 5 and 7
    //         }
    //     num++;
    // }
    for(int num=1; num<=100; num++){

        if(num%5==0 && num%7==0){
            System.out.println("Found: " + num);
            break; // Exit the loop when a number is found that is divisible by both 5 and 7
        }
    }

    }
    
}
