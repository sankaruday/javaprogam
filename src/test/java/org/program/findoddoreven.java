package org.program;

import java.util.Scanner;

public class findoddoreven {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("number is ");
		int n = sc.nextInt();
		
		
		
		if (n%2==0) {
			
			System.out.println("number is even");
			
		} else {

			System.out.println("number is odd");
		}
	}

}
