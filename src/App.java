import classes.Exercises;

public class App {
	public static void main(String[] args) throws Exception {
		String result = 
			Exercises.formatPersonalData("PERSONAL_DATA:NAME=juan, EMAIL=juan@test.com, AGE=20");
		System.out.println(result);
	}
}
