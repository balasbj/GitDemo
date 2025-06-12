package practice.day1;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {56,0,0,45,76,89,90};
		
		int insertionposition = 0;
		
		
		
		for(int i=0; i< a.length;i++) {
			
			if(a[i] != 0) {
				
				a[insertionposition] = a[i];
				
				insertionposition ++;
			}
		}
			
			while(insertionposition < a.length ) {
				
				a[insertionposition] = 0;
				insertionposition ++;
			}
			
			
			System.out.println(Arrays.toString(a));
			
		}
		
	}


