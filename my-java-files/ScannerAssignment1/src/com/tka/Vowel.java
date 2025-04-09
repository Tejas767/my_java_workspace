package com.tka;

import java.util.Scanner;

public class Vowel {

	// counting number of vowels in sentence

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the sentence: ");
		String vowel = sc.nextLine().toLowerCase();

		int count = 0;
		int acount = 0;
		int ecount = 0;
		int icount = 0;
		int ocount = 0;
		int ucount = 0;

		for (int i = 0; i < vowel.length(); i++) {
			char ch = vowel.charAt(i);

			/*
			 * if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
			 * 
			 * Count++;
			 * 
			 * }
			 */

			switch (ch) {
			case 'a':
				acount++;
				count++;
				break;

			case 'e':
				ecount++;
				count++;
				break;

			case 'i':
				icount++;
				count++;
				break;

			case 'o':
				ocount++;
				count++;
				break;

			case 'u':
				ucount++;
				count++;
				break;

			default:
				System.out.println("there are no vowels present in sentence");

			}

		}
		
		System.out.println("a: " + acount);
		System.out.println("e: " + ecount);
		System.out.println("i: " + icount);
		System.out.println("o: " + ocount);
		System.out.println("u: " + ucount);
		System.out.println("Total vowels: " + count);
		sc.close();

	}

}
