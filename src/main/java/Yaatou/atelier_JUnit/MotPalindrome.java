package Yaatou.atelier_JUnit;

public class MotPalindrome {

        public static boolean isPalindrome(String str) {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        }


}
