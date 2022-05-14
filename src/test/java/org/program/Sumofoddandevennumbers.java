package org.program;

public class Sumofoddandevennumbers {

	public static void main(String[] args) {
		
		int sum=0;
		int sum1=0;

		for (int i = 0; i <=100; i++) {
			
			if (i%2==1) {
				
				sum=sum+i;
				
			}
			else {
				
				sum1=sum1+i;
			}
			
		}
		System.out.println("sum of odd numbers are " + sum);
		System.out.println("sum of even numbers are " + sum1);
	}

}
