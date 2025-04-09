package com.tka;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter your word to check palindrome");
		String s=sc.nextLine().toLowerCase();
		
		String reverse="";
		
		
		for (int i=s.length()-1;i>=0;i--) {
			reverse +=s.charAt(i);
		}
		
		if (reverse.equals(s)) {
			System.out.println("its a palindrome");
		}
		
		else 
			System.out.println("not a palindrome");
		sc.close();
	
	}

}
