package org.program;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int [] a= {2,5,6,4,8};
		
		System.out.println("BEFORE SORTING "+ Arrays.toString(a));
		
		for (int i = 0; i < (a.length)-1; i++) {
			
			for (int j = 0; j <(a.length)-1; j++) {
				
				if (a[j]>a[j+1]) {
					
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		
		System.out.println("AFTER SORTING "+ Arrays.toString(a));
	}

}
