package classes;

import java.util.Collection;

public class CommonMethod {
  
  public static boolean isEven(int number) {
    return number % 2 == 0;
  }

  public static int getMaxNumber(Collection<Integer> arr) {
		int max = 0;
		for (Integer integer : arr) {
			if (integer > max) {
				max = integer;
			}
		}
		return max;
	}

}
