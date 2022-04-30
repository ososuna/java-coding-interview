package classes;

import java.util.ArrayList;
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
  public static List<String> removeNullFalseAndZero(List<String> list) {
    for (int i = 0; i < list.size(); i++) {
      if( list.get(i) == null || list.get(i).equals("false") || list.get(i).equals("0") ) {
        list.remove(i);
      }
    }
    return list;
  }

  // remove one dimension array from two dimension array
  public static List<Integer> removeOneDimensionArray(List<List<Integer>> lists) {
    List<Integer> list = new ArrayList<Integer>();
    lists.stream().forEach(l -> list.addAll(l));
    return list;
  }


}
