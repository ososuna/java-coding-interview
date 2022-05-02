package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Exercises {
  
  // multiply two numbers wihout using *
  public static int multiply(int a, int b) {
    boolean positive = Math.abs(b) == b;
    int result = 0;
    for (int i = 0; i < Math.abs(b); i++) {
      result = positive ? result + a : result - a;
    }
    return result;
  }

  // get biggest number in array traversing once
  public static Double getBiggest(List<Double> numbers) {
    Double biggest = 0.0;
    for (int i = 0; i < numbers.size(); i++) {
      if( numbers.get(i) > biggest ) {
        biggest = numbers.get(i);
      }
    }
    return biggest;
  }

  // remove null, false and 0 from array traversing once
  public static List<String> clean(List<String> list) {
    for (int i = 0; i < list.size(); i++) {
      if( list.get(i) == null || list.get(i).equals("false") || list.get(i).equals("0") ) {
        list.remove(i);
      }
    }
    return list;
  }

  // remove one dimension array from two dimension array
  public static List<Integer> flatten(List<List<Integer>> lists) {
    List<Integer> list = new ArrayList<Integer>();
    lists.stream().forEach(l -> list.addAll(l));
    return list;
  }

  // count repeated words in string
  public static HashMap<String, Integer> countRepeatedWords(String text) {
    List<String> list = Arrays.asList(text.split(" "));
    HashMap<String, Integer> hash = new HashMap<>();
    for (int i = 0; i < list.size(); i++) {
      if ( hash.containsKey(list.get(i)) ) {
        hash.put(list.get(i), (hash.get(list.get(i)))+1);
      } else {
        hash.put(list.get(i), 1);
      }
    }
    return hash;
  }

  // palindrome
  public static boolean isPalindrome(String string) {
    String reverse = "";
    for (int i = string.length() - 1; i >= 0; i--) {
      reverse += string.charAt(i);
    }
    return string.equals(reverse);
  }

}
