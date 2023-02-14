package dev.ososuna.classes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class String {
  /**
   * Count repeated words in a string
   * @param str String
   * @return HashMap with word as key and times repeated as value
   */
  public static HashMap<java.lang.String, Integer> countRepeated(java.lang.String str) {
    List<java.lang.String> list = Arrays.asList(str.split(" "));
    HashMap<java.lang.String, Integer> repeated = new HashMap<>();
    list.stream().forEach(s -> {
      if (!repeated.containsKey(s)) {
        repeated.put(s, 1);
      } else {
        repeated.put(s, repeated.get(s) + 1);
      }
    });
    return repeated;
  }

  /**
   * Checks if a string is palindrome
   * @param str String
   * @return True or false
   */
  public static boolean isPalindrome(char[] str) {
    if (str.length == 0 || str.length == 1) {
      return true;
    }
    str = java.lang.String.valueOf(str)
      .replaceAll("\\s", "")
      .toLowerCase()
      .toCharArray();
    int start = 0, end = str.length-1;
    while (start < end) {
      if (str[start] != str[end]) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }
}
