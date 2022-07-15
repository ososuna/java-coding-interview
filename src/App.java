import classes.Exercises;

public class App {
	public static void main(String[] args) throws Exception {
		int[] arr = {3, 9, 2, 3, 1, 7, 2, 3, 5}; // key = 3, output = [9, 2, 1, 7, 2, 5]
		int[] result = Exercises.removeAllOccurrences(arr, 3);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

}