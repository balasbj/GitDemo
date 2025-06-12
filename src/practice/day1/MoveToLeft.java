package practice.day1;

import java.util.Arrays;

public class MoveToLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {67,0,90,80,70};
		
		
		int count = a.length-1;
		
		
		
		
		for(int i = a.length-1; i>=0;i++) {
			
			if (a[i] != 0) {
				
				a[count] = a[i];
				
				count --;
			}
		}

		
		while(count >= a.length-1) {
			
			a[count] = 0;
			
			count --;
		}
		
		
		
		System.out.println(Arrays.toString(a));
	}

}
