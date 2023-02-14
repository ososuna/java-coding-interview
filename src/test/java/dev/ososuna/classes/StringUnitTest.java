package dev.ososuna.classes;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

public class StringUnitTest {

  @Test
  public void testCountRepeated() {
    java.lang.String str = "Different repeated repeated words and can can can can create a rhythmic pattern and add emphasis to a sentence making the the the the the the message more memorable memorable memorable and powerful";
    HashMap<java.lang.String, Integer> repeated = new HashMap<>();
    repeated.put("Different", 1);
    repeated.put("repeated", 2);
    repeated.put("words", 1);
    repeated.put("and", 3);
    repeated.put("can", 4);
    repeated.put("create", 1);
    repeated.put("a", 2);
    repeated.put("rhythmic", 1);
    repeated.put("pattern", 1);
    repeated.put("add", 1);
    repeated.put("emphasis", 1);
    repeated.put("to", 1);
    repeated.put("sentence", 1);
    repeated.put("making", 1);
    repeated.put("the", 6);
    repeated.put("message", 1);
    repeated.put("more", 1);
    repeated.put("memorable", 3);
    repeated.put("powerful", 1);
    assertThat(String.countRepeated(str), is(repeated));
  }

  @Test
  public void testIsPalindromeLength0or1() {
    assertTrue(String.isPalindrome("a".toCharArray()));
    assertTrue(String.isPalindrome("".toCharArray()));
  }

  @Test
  public void testIsPalindrome() {
    assertTrue(String.isPalindrome("Luz azul".toCharArray()));
    assertTrue(String.isPalindrome("Anita lava la tina".toCharArray()));
  }

  @Test
  public void testIsNotPalindrome() {
    assertFalse(String.isPalindrome("Luz azull".toCharArray()));
    assertFalse(String.isPalindrome("This is not palindrome".toCharArray()));
    assertFalse(String.isPalindrome("abc".toCharArray()));
  }
}
