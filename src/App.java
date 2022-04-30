import java.util.ArrayList;
import java.util.Arrays;

import classes.Exercises;

public class App {
	public static void main(String[] args) throws Exception {
		System.out.println(Exercises.removeNullFalseAndZero(
			new ArrayList<String>(Arrays.asList("true", null, "s", "false", "1", "0"))
		));
	}
}
