import java.util.ArrayList;
import java.util.Scanner;

public class shift {
	
	public static String encrypt() {
		
		// opens scanner for user input
		Scanner sc = new Scanner(System.in);
		
		// inquires user for input
		System.out.println("Please enter text: ");
		
		// saves user input (important to use nextLine() so it continues
		// even if user input spaces
		String input = sc.nextLine();
		
		// converts given text to all upper case
		String str = input.toUpperCase();
	
		
		// initialize empty ArrayList for text
		ArrayList<Integer> text = new ArrayList<Integer>();
		
		// this for loop puts the ASCII values of the text into an array
		// for length of text
		for (int i = 0; i < str.length(); i++) {
			// initialize character
			char character = str.charAt(i);
			// initialize ASCII value as character
			int ascii = (int) character;
			if (ascii > 64 && ascii < 91) {
				ascii += 5;
			}
			else {
				ascii += (40 + i);
			}
			// add ASCII value to ArrayList
			text.add(ascii);
		}
		// System.out.println(text);
		StringBuilder encrypted = new StringBuilder();
		
		for (int j = 0; j < text.size(); j++) {
			// System.out.println(text.get(j));
			encrypted.append(Character.toString((char)(int)text.get(j)));
		}
		sc.close();
		return encrypted.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(encrypt());
	}
	
}
	
