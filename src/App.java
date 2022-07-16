import classes.Exercises;

public class App {
	public static void main(String[] args) throws Exception {
		char[] str = "Hello world".toCharArray();
		str = Exercises.reverseString(str);
		System.out.println(String.valueOf(str));
	}

}