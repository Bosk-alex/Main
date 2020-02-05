import java.util.Arrays;

public class Main {
	
	public static void main(String... args) {
		System.out.println(args.getClass());
		String[] array = {"1", "3", "4"};
		String[] newArray = Arrays.copyOf(array, 15);
		Arrays.fill(newArray, array.length, newArray.length, "#");
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(newArray).replaceAll("[\\[, \\]]", ""));
	}

}