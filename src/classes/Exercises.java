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
  
  public static void printPairsDifferenceIsK(int k) {
    Integer numbersArr[] = new Integer[] {42,41,50,47,48,3,5,0,2,7,40,44};
    List<Integer> numbersList = Arrays.asList(numbersArr);
    HashMap<Integer, Integer> numbers = new HashMap<>();
    numbers.put(42, 42);
    numbers.put(41, 41);
    numbers.put(50, 50);
    numbers.put(47, 47);
    numbers.put(48, 48);
    numbers.put(3, 3);
    numbers.put(5, 5);
    numbers.put(0, 0);
    numbers.put(2, 2);
    numbers.put(7, 7);
    numbers.put(40, 40);
    numbers.put(44, 44);
    
    for (Integer number : numbersList) {
      if (numbers.containsKey(number-k)) {
        StringBuilder output = new StringBuilder();
        output.append(number);
        output.append(", ");
        output.append(number-k);
        System.out.println(output.toString());
      }
    }
  }
  
  public static int removeDuplicates(int[] arr) {
    if (arr.length == 0 || arr.length == 1)
      return arr.length;
    int j = 0;
    for (int i = 0; i < arr.length-1; i++)
      if (arr[i]!=arr[i+1])
        arr[j++] = arr[i];
      arr[j++] = arr[arr.length-1];
    return j;
  }
}
