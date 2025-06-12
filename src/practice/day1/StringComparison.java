package practice.day1;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaabbcccccdddd";
		
		StringBuilder result = new StringBuilder();
		
		int index = 0;
		
		while(index < str.length()) {
			
			char currentChar = str.charAt(index);
			
			int count = 0;
			
			
			while(index < str.length() && str.charAt(index) == currentChar) {
				
				count ++;
				index++;
			}
			
			
			result.append(currentChar).append(count);
			

		}
		
		
		System.out.println(result);
		
	}

}
