package dev.ososuna.classes;

import java.util.List;

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
}
