import java.util.*;
public class PredefinedMethods {

	public static void main(String[] args) {
//		Mathematical Operations
		double sq= Math.sqrt(16);  
		// Returns the square root of a number.
		double power = Math.pow(2, 3);  
		// Returns a raised to the power of b.
		System.out.println("squareroot:"+sq+"power:"+power);

//		Array Utilities
		int[] numbers = {5, 3, 8, 1};
		Arrays.sort(numbers);  //Sorts an array in ascending order.
		System.out.println(Arrays.toString(numbers));  
		// Returns a string representation of the array.Output: [1, 3, 5, 8]

//		String Manipulation
		String text = "Hello, World!";
		int length = text.length();  // Returns the length of the string.
		System.out.println("length of stirng"+length);
		char letter = text.charAt(0);  //Returns the character at the specified index.
		System.out.println("character at index 0 is:"+letter);
		String upperText = text.toUpperCase();  // Converts all characters of the string to upper-case.
		System.out.println("string in uppercase:"+upperText);


		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the text");
		String input = scanner.nextLine(); //Reads the next line of input from the user.
		System.out.println(input);
		int number = scanner.nextInt(); //Reads the next integer from the user input.
		System.out.println(number);

	}

}