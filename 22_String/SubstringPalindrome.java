class SubstringPalindrome {

    public int countSubstrings(String s) {

        int count = 0;

        for(int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            count += expand(s, i, i);

            // Even length palindrome
            count += expand(s, i, i + 1);
        }

        return count;
    }

    private int expand(String s, int left, int right) {

        int count = 0;

        while(left >= 0 &&
              right < s.length() &&
              s.charAt(left) == s.charAt(right)) {

            count++;

            left--;
            right++;
        }

        
        return count;
    }

       public static void main(String[] args) {

        String s = "abc";

        SubstringPalindrome sp = new SubstringPalindrome();
        int result = sp.countSubstrings(s);

        System.out.println(result);
    }
}