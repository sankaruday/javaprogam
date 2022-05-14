package org.program;

import java.util.Scanner;

public class Biggestoffournumbers {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if (a>b && a>c && a>d) {
			
			System.out.println("buggest number is  "+a);
		} else if(b>a && b>c && b>d) {

			System.out.println("buggest number is  "+b);
		}
		else if(c>a && c>b && c>d) {
			System.out.println("buggest number is  "+c);
		}
		else {
			System.out.println("buggest number is  "+d);
		}
	}

}
