package Yaatou.atelier_JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MotPalindromeTest {


        @Test
        public void testIsPalindrome() {
            assertTrue(MotPalindrome.isPalindrome("madam"));
            assertFalse(MotPalindrome.isPalindrome("hello"));
        }





}
