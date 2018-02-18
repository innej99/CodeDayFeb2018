
public class encryptoein {
	
	public static String cipher(String str, int shift) {
		
		// initializes empty array length of given String
		int[] characters = new int[str.length()];
		
		// initializes new stringbuilder
		StringBuilder encrypted = new StringBuilder();
		
		// converts given string to all upper case for easy ASCII usage
		str = str.toUpperCase();
		
		// for loop until reaches end of string
		for (int i = 0; i < str.length(); i++) {
			
			// initializes ascii as char value - 65 for each char in string
			int ascii = str.charAt(i) - 65;
			
			// sets array value to ascii value + given shift
			// mod 26 to stay in range
			// add 65 to go back to letter range
			characters[i] = ((ascii + shift) % 26) + 65;
			
			// append character value of number to stringbuilder encrypted
			encrypted.append(Character.toString((char)characters[i]));
		}
		// return encrypted as a lowercase string
		return encrypted.toString().toLowerCase();
				
	}
	
	public static void main(String[] args) {
		// "hello" shift 2, expects "jgnnq"
		System.out.println(cipher("hello", 2));
		// "world" shift 5, expects "btwqi"
		System.out.println(cipher("world", 5));
	}
	
	
}
