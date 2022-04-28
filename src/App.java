import java.util.Arrays;

import classes.Exercises;

public class App {
	public static void main(String[] args) throws Exception {
		System.out.println(Exercises.multiply(-3, 5));
		System.out.println(Exercises.getBiggest(
			Arrays.asList(new Double[]{100.0, 65.0, 32.0, 91.0, 4.8, 90.0, 90.5})
		));
	}
}
