package com.library;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your contact number");
		long num=sc.nextLong();
		sc.nextLine();
		
		
		System.out.println("Enter librarian name");
		String libname=sc.nextLine();
		
		System.out.println("Enter library location");
		String location=sc.nextLine();
		
		System.out.println("Enter number of books");
		int num_books=sc.nextInt();
		
		Libdetails lib=new Libdetails();
		
		lib.setContact_number(num);
		lib.setLibrarian_name(libname);
		lib.setLocation(location);
		lib.setTotal_books(num_books);
		
		
		
		System.out.println("Your contact number is: "+ lib.getContact_number());
		System.out.println("Librarian name: "+ lib.getLibrarian_name());
		System.out.println("Location of library: "+ lib.getLocation());
		System.out.println("Total no. of books available: "+ lib.getTotal_books());
		
		
		
	}

}
