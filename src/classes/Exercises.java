package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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
  
  // input
  // PERSONAL_DATA:NAME=juan, EMAIL=juan@test.com, AGE=20
  // conditions
  // order is name, email, age
  // name and email are mandatory
  // output
  // Hello my name is juan || email is juan@test.com || age is 20
  public static String formatPersonalData(String personalData) {
    List<String> list = new ArrayList<>(Arrays.asList(personalData.split(":|,|=")));
    list.remove(0);
    list = list
    .stream()
    .map(str -> str.replaceAll("\\s", ""))
    .collect(Collectors.toList());
    HashMap<String, String> hash = new HashMap<>();
    String lastKey = "";
    for (int i = 0; i < list.size(); i++) {
      if (CommonMethod.isEven(i)) {
        hash.put(list.get(i), "");
        lastKey = list.get(i);
      } else {
        hash.put(lastKey, list.get(i));
      }
    }
    if (!hash.containsKey("NAME") || !hash.containsKey("EMAIL")) {
      throw new IllegalArgumentException("NAME and EMAIL are mandatory");
    }
    StringBuilder output = new StringBuilder();
    output.append("Hello my name is ");
    output.append(hash.get("NAME"));
    output.append(" || email is ");
    output.append(hash.get("EMAIL"));
    if (hash.containsKey("AGE")) {
      output.append(" || age is ");
      output.append(hash.get("AGE"));
    }
    return output.toString();
  }
  
  // validate if string is a valid ipv4 address
  public static boolean isIPv4Address(String address) {
    List<String> parts = new ArrayList<>(Arrays.asList(address.split("\\.")));
    if(parts.size() != 4) {
      return false;
    }
    for (String str : parts) {
      try {
        if (!(Integer.parseInt(str) >= 0) || !(Integer.parseInt(str) <= 255)) {
          System.out.println("not between 0 and 255");
          return false;
        }
      } catch (Exception e) {
        return false;
      }
    }
    return true;
  }
  
  public static void printPairsDifferenceIsK(int[] arr, int k) {
    HashMap<Integer, Boolean> hash = new HashMap<>();
    for (int i = 0; i < arr.length; i++)
      hash.put(arr[i], true);
    for (int i = 0; i < arr.length; i++)
      if (hash.containsKey(arr[i]-k))
        System.out.println(arr[i] + ", " + String.valueOf(arr[i]-k));
  }
  
  public static int[] removeDuplicatesFromSortedArray(int[] arr) {
    if (arr.length == 0 || arr.length == 1)
      return arr;
    int j = 0;
    for (int i = 0; i < arr.length-1; i++)
      if (arr[i]!=arr[i+1])
        arr[j++] = arr[i];
      arr[j++] = arr[arr.length-1];
    return Arrays.copyOf(arr, j);
  }

  public static int[] removeAllOccurrences(int[] arr, int k) {
    if (arr.length == 0 || arr.length == 1)
      return arr;
    int n = 0;
    for (int i = 0; i < arr.length; i++)
      if (arr[i] != k)
        arr[n++] = arr[i];
    return Arrays.copyOf(arr, n);
  }

  public static char[] reverseString(char[] str) {
    if (str.length == 0 || str.length == 1)
      return str;
    int start = 0, end = str.length-1;
    while (start < end) {
      str[start] ^= str[end];
      str[end] ^= str[start];
      str[start] ^= str[end];
      start++;
      end--;
    }
    return str;
  }
}
