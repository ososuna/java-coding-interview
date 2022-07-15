import classes.Exercises;

public class App {
	public static void main(String[] args) throws Exception {
		int[] arr = {1, 1, 1, 2, 3, 3, 3, 3, 3, 4, 4, 5, 5 ,5 ,5};
		int n = Exercises.removeDuplicates(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]);
		}
	}

}