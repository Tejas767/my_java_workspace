package food;

public class Fooditems {
	
	String name;
	int fooditems;
	int price;
	int GST=5;
	double gstamt;
	double payable;
	int totalbill;
	
	

	public  Fooditems(String name,int fooditems,int price) {
		this.name=name;
		this.fooditems=fooditems;
		this.price=price;
		
	}
	
	
	public void totalbill () {
		totalbill=fooditems*price;
		
		gstamt=(GST/100.0)*totalbill;
		
		payable=totalbill+gstamt;
		
	}
	
	public void totalpayable() {
		 System.out.println("\n--- Final Bill ---");
	        System.out.println("Name         : " + name);
	        System.out.println("Items        : " + fooditems);
	        System.out.println("Price        : ₹" + price);
	        System.out.println("Total        : ₹" + totalbill);
	        System.out.println("GST (5%)     : " + gstamt);
	        System.out.println("Payable Amt  : ₹" + payable);
	}
	
	
}
