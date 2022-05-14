package org.program;

import java.util.Scanner;

public class Swappingtwonumbersusingthidvariable {

	public static void main(String[] args) {
		
		int a,b,c;

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the two numbers");
		
		 a = sc.nextInt();
		 b=sc.nextInt();
		
		System.out.println("after swapping ");
		
		
		c=a;
		a=b;
		b=c;
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
