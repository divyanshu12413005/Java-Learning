public class BitwiseOperators{
    public static void main(String[] args) {
        int p=9;
        int q=10;
        System.out.println(p & q); // Bitwise AND
        System.out.println(p | q); // Bitwise OR
        System.out.println(p ^ q); // Bitwise XOR
        System.out.println(~p);    // Bitwise NOT
        System.out.println(p << 1); // Left shift
        System.out.println(p<< 2); // Right shift
        System.out.println(q >> 1); // Right shift
        System.out.println(q >> 2); // Right shift

    }
}