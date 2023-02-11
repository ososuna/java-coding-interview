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
  

}
