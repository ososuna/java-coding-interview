import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import classes.Exercises;

public class App {
	public static void main(String[] args) throws Exception {
		List<List<Integer>> lists = new ArrayList<>();
		lists.add(Arrays.asList(1, 2, 3));
		lists.add(Arrays.asList(4, 5, 6));
		lists.add(Arrays.asList(7, 8, 9, 10));
		System.out.println(lists);
		System.out.println(Exercises.removeOneDimensionArray(lists));
	}
}
