package bookdtl;

public class Bookdetails {

	String title;
	String author;
	int price;
	
	
	public Bookdetails(String title,String author,int price) {
		  this.title=title;
		  this.author=author;
		  this.price=price;
	}
	
	public void bookdetails() {
		 System.out.println("--------------- BOOK DETAILS ---------------");
	        System.out.println("Title  : " + title);
	        System.out.println("Author : " + author);
	        System.out.println("Price  : ₹" + price);
	        System.out.println("--------------------------------------------");
	}
	
}
