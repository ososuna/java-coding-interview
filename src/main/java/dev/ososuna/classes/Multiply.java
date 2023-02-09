package dev.ososuna.classes;

public class Multiply {

  /**
   * Multiplies two integers without using * operator
   * @param a first integer
   * @param b second integer
   * @return The product of a and b
   */
  public static int multiply(int a, int b) {
    if (a == 0 || b == 0) {
      return 0;
    }
    boolean positive = Math.abs(b) == b;
    int result = 0;
    for (int i = 0; i < Math.abs(b); i++) {
      result = positive ? result + a : result - a;
    }
    return result;
  }
}
