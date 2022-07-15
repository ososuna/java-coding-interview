import classes.Exercises;

public class App {
	public static void main(String[] args) throws Exception {
		int[] arr = {1, 1, 2, 3, 3, 3, 3, 4, 5};
		int[] result = Exercises.removeDuplicatesFromSortedArray(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

}