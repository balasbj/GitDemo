package practice.day1;

public class PrimeNumber {
	
	static Boolean isPrime(long num) {
		
		if(num == 2 || num == 3 || num == 5) return true;
		
		if(num<=1 || num % 2 == 0 || num % 5 == 0) return false;
		
		for(int i=2; i<= Math.sqrt(num);i++) {
			
			if(num%i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
    public static void main(String[] args) {
      
    	int num = 91;
    	
    	if(isPrime(num)) {
    		
    		
    		System.out.println(num+" "+ "is a prime number");
    	}
    	else {
    		
    		System.out.println(num+" "+ "is not a prime number");

    		
    	}
    
    
    }
}

