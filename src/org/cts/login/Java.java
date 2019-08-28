package org.cts.login;

import java.util.Scanner;

public class Java {
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter teh anme");
		String s=sc.nextLine();
		System.out.println(s);
		
		System.out.println("enter the value");
		int number=sc.nextInt();
		System.out.println(number);
		
		System.out.println("enter the salary");
		float salary=sc.nextFloat();
		System.out.println("my salary is:"+salary);
		
		System.out.println("enter the initial");
		char c=sc.next().charAt(0);
		System.out.println(c);
	}

}
