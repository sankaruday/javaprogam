package org.program;

import java.util.Scanner;

public class Countofvowelsandnonvowels {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the string");
		
		String a = sc.nextLine();
		
		int vowels = 0;
		
	int nonvowels=0;
		
		for (int i = 0; i < a.length(); i++) {
			
			char ch = a.charAt(i);
			
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' ||ch=='E'||ch=='I'||
					ch=='O'||ch=='U') {
				
			vowels++;
				
			} else {
nonvowels++;
			}
			
		}
		System.out.println("count of vowels are "+vowels);
		System.out.println("count of nonvowels are "+nonvowels);
	}

}
