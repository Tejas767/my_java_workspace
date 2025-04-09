package food;

import java.util.Scanner;

public class Dispfooditems {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("Enter your name");
		String name=sc.nextLine();
		
		System.out.println("Enter the number of food items");
		int fooditems=sc.nextInt();
		
		System.out.println("Enter the price per item");
		int price=sc.nextInt();
		
		Fooditems food=new Fooditems(name, fooditems, price);
		food.totalbill();
		food.totalpayable();
		
		
		
	}

}
