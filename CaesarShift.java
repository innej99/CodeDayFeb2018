import java.util.ArrayList;
import java.lang.Character;
import java.lang.*;

public class CaesarShift {
	
	public static String encrypt() {
		
		//initialize integer ArrayList 
		ArrayList<Integer> before = new ArrayList<Integer>();
		
		// initialize String word to be encrypted
		String input = "HELLO";
		
		// converts given string to all uppercase
		String word = input.toUpperCase();
//		String output = "";
//		int values = 0;

		StringBuilder sb = new StringBuilder();
		for (char c : input.toCharArray())
		    sb.append((int)c);
		
		
//		// converts string to ASCII values
//		for (int c = 0; c < word.length(); c++) {
//			
//			int v = ((word.charAt(c));
//			before.add(v);
//		}
		
		
		return sb.toString();
//		// iterates through entire length of String word
//		for (int i = 0; i < word.length(); i++) {
//			
//			//
//			
//			// adds each letter of word to ArrayList before
//			before.add(word.charAt(i));
//		}
//		return str;
		
	}
	
	public static void main(String[] args) {
		System.out.println(encrypt());
	}
}

