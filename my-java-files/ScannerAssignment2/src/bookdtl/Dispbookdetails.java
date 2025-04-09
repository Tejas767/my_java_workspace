package bookdtl;

import java.util.Scanner;

public class Dispbookdetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter title of the Book");
		String title=sc.nextLine();
		
		System.out.println("Enter Book Author");
		String author=sc.nextLine();
		
		System.out.println("Enter the price of the Book");
		int price=sc.nextInt();
		
		Bookdetails book=new Bookdetails(title, author, price);
		book.bookdetails();
	}

}
