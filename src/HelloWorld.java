import java.util.Arrays;
import java.util.Scanner; //CMD + Shift + O to automatically import any needed objects referenced in the code (in this case, the scanner object)

/* 
 * @author : Adam DePollo
 */

public class HelloWorld {
	public static void main(String[] args) {
		// void = return type (in this case, returning nothing
		// main =
		// String[] = an array ([]) of strings
		// hit ctrl + space to automatically create a main method
		// hit cmd + shift + f to auto-format the doc

		Scanner scnr = new Scanner(System.in);
		// objects are declared using "new" (e.g., Scanner scnr = new
		// Scanner(System.in);)
		// text within the parentheses after "Scanner" are parameters for the object

		System.out.println("Hello world!");

		System.out.println("Please enter your full name:");

		String name = scnr.nextLine();

		System.out.println(name);

		System.out.println("Please enter your age:");

		int age = scnr.nextInt();
		scnr.nextLine(); // entering this is necessary to clear out the scanner before moving to the next
							// token. The scanner won't work correctly if you try to input a string after
							// inputting an int.

		System.out.println(age);

		boolean b = true;
		System.out.println(b);

		// this is how you close the scanner (note: not required, but best practice)
		scnr.close();

		// Constants should be declared in all caps and have "final" at the front of the
		// declaration. Including the final makes it so that the constant can't be
		// redefined later.
		final int BANANA = 1;
		System.out.println(BANANA + 1);

		// chars can only be one character long, should be written within a single quote
		char letter = 'p';
		System.out.println(letter);

		byte bByte = Byte.MAX_VALUE;
		System.out.println(bByte);

		// By default, any floating point number is considered a double rather than a
		// float in order to ensure max precision. If you want to use a float, you need
		// to use the keyword float in front (i.e., cast it as a float) or add an f on
		// the end.
		float f = (float) 1.2;
		float g = 1.1f;

		// Similarly, any number defaults to int. If you want to use a long, you need to
		// cast it as a long. Note, you can only do this with L at the end, you can't
		// use the long tag in front.
		long longNum = 7239487101409871579L;

		// Arrays need to be declared with a size.
		int[] arr = new int[3];
		System.out.println(Arrays.toString(arr));

		int test = 5;
		++test;
		System.out.println(test);

		// implicit casting example
		int numTest = 50;
		double numTest2 = numTest;

		// explicit casting example
		double numTest3 = 1.1;
		float numTest4 = (float) numTest3;

	}
}
