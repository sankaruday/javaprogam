package org.program;

public class Printonetohundrendpalndrome {

	public static void main(String[] args) {
		
		int count=0;
		for (int n = 1; n <= 100; n++) {
			int a, i = 0, j = 0;
			a = n;
			while (a > 0) {
			i = a % 10;
			j = (j * 10) + i;
			a = a / 10;
			}
			if (n == j) {
				count++;
			System.out.println(n);
			
			}
			
			}
		System.out.println("no of palndrome numbes is "+count);
			}
			}


