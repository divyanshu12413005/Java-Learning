public class reverseWords {

    public static void main(String[] args) {

        String s = "hello world";

        String[] words = s.split(" ");

        StringBuilder result = new StringBuilder();

        for(String word : words) {

            String reversed = new StringBuilder(word).reverse().toString();

            result.append(reversed).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
