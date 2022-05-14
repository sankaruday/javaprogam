package org.program;

public class Countofoddandevennumbers {

	public static void main(String[] args) {
		
		int count=0;
		int count1 =0;

		for (int i = 1; i <=100; i++) {
			
			if (i%2==1) {
				
				count=count+1;
				
				
			} else {
				count1=count1+1;

			}
			
		}
		System.out.println("count of odd numbers are "+count);
		System.out.println("count of even numbers are "+count1);
	}

}
