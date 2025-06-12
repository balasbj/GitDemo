package practice.day1;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "aaabbc";  // Given string
        String compressed = "";   // Empty string to store result
        int index = 0;            // Starting position in the string

        while (index < input.length()) {  // Go through each character
            char currentChar = input.charAt(index); // Pick current character
            int count = 0;  // Count how many times the character appears

            // Count occurrences of the same character
            while (index < input.length() && input.charAt(index) == currentChar) {
                count++;   // Increase count for the current character
                index++;   // Move to the next character
            }

            // Add the character and its count to the result
            compressed += currentChar + count;
        }

        System.out.println("Compressed String: " + compressed);
    }

		
	

}