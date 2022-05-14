package org.program;

import java.util.Scanner;

public class ReversetheNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number ");
		
		int n = sc.nextInt();
		
		int a,i=0,j=0;
		
		
		a=n; //n=321
		while(a>0) {
			
			i=a%10; //321%10=1
			j=(j*10)+i; //(0*10)+1=1
			a=a/10; //321/10=32
			
			
		}
		
		System.out.println("reverse number is "+j);
		
		if (j==n) {
			
			System.out.println("given number is palindrome");
			
		} else {
			
			System.out.println("given mumber is not a palindrome");

		}
		
		
		
		
	}

}
