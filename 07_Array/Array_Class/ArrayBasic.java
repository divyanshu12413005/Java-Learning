

public class ArrayBasic {
    public static void main(String[] args) {
        int ages[]=new int[3];
        float weight[]={ 65.5f, 70.0f, 75.2f };
        // Alternative way to declare and initialize an array
        // float weight[] = new float[]{ 65.5f, 70.0f, 75.2f };
        String names[]=new String[3];

        ages[0]=20;
        ages[1]=25;
        ages[2]=30;


       
        names[0]="Alice";
        names[1]="Bob"; 
        names[2]="Charlie";

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);


        System.out.println(ages.length); // Output: 3
        System.out.println(weight.length); // Output: 3
        System.out.println(names.length); // Output: 3


    }
    
}
