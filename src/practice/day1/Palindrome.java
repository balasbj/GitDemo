package practice.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "malayalam";
		
		String reversed ="";
		
		for(int i =text.length()-1; i>=0;i--) {
			
			reversed += text.charAt(i);
		}
		
		System.out.println(reversed);
	
	
	if(text.equals(reversed)) {
		
		System.out.print(text + "is a palindrome");
		
	}
	else {
		
		System.out.print(text + "is not a palindrome");
		
	}

}
}