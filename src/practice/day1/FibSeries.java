package practice.day1;

public class FibSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		
		int b = 1;
		
		for(int i= 2; i<= 20;i++) {
			
		int	c = a+b;
			a=c;
			b=a;
			
		}
		
		
	}

}
