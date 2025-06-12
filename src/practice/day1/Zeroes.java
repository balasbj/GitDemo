package practice.day1;

import java.util.Arrays;

public class Zeroes {
	
	public void MovetoRight(int a[], int n) {
		
		
		int count = 0; 
		
		
		for(int i= 0; i < a.length;i++) {
			
			if(a[i] != 0) {        // 1st a[0] = 3 
				
				a[count] = a[i];     // a[0] = a[0];
				count++;         //count1	
			}
		}
		
		while(count< a.length) {
			
			a[count] = 0;
			
			count++;
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zeroes mover = new Zeroes();
		int a[] = {3,0,0,6,0,7};
		int n = a.length;
		
		mover.MovetoRight(a, n);
		
		System.out.print(Arrays.toString(a));
		
	}

}
