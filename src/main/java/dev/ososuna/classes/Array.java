package dev.ososuna.classes;

import java.util.List;
import java.util.stream.Collectors;

public class Array {

  /**
   * Get biggest number in array traversing once
   * @param numbers List of numbers
   * @return The biggest number in given array
   */
  public static Double getBiggest(List<Double> numbers) {
    Double biggest = 0.0;
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) > biggest) {
        biggest = numbers.get(i);
      }
    }
    return biggest;
  }

  /**
   * Remove null, false and 0 from array traversing once
   * @param numbers List of String
   * @return The clean list
   */
  public static List<String> clean(List<String> list) {
    return list
      .stream()
      .filter(s -> s != null && !"false".equals(s) && !"0".equals(s))
      .collect(Collectors.toList());
  }
}
