package JUnit5.JUnit5;

public class StringProcessor {

        // returns the string reversed
        public String reverse(String input) {
            String result = "";
            for (int i = input.length() - 1; i>= 0; i--) {
                result += input.charAt(i);
            }
            return result;
        }

        // returns true if the string is a palindrome (case-insensitive)
        public boolean isPalindrome(String input) {
            String result = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                result += input.charAt(i);
            }
            return result.equalsIgnoreCase(input);
        }

        // returns the count of vowels (a,e,i,o,u) in the string
        public int countVowels(String input) {
            int count = 0;
            for (int  i = input.length() - 1; i >= 0; i--) {
               if  (input.charAt(i) == 'a' || input.charAt(i) == 'e'  || input.charAt(i) == 'i' || input.charAt(i) == 'o'  || input.charAt(i) == 'u') {
                   count = count + 1;
               }
           }
           return count;
        }

        // returns "short" if length < 5, "medium" if 5–9, "long" if 10+
        public String classify(String input) {
            String result = "";
            if (input.length() < 5) {
                result = "short";
        }
            else if (input.length() >= 5 && input.length() <= 9 ) {
                result = "medium";
            }
            else {
                result = "long";
            }
            return result;
    }
}
