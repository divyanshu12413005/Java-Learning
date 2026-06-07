
public class string_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);


        //setting a character at a specific index
        sb.setCharAt(0, 'm');   
            System.out.println(sb);

        //appending a string to the end of the existing string
        sb.append(" World");
        System.out.println(sb);

        //inserting a string at a specific index
        sb.insert(5, ",");
        System.out.println(sb); 

        //replacing a substring with another string
        sb.replace(7, 12, "Java");
        System.out.println(sb);

        //deleting a substring from the string
        sb.delete(5, 6);
        System.out.println(sb); 

        //deleting a character at a specific index
        sb.deleteCharAt(5);
        System.out.println(sb);
        
        //reversing the string
        sb.reverse();
        System.out.println(sb);
    }
    
}
