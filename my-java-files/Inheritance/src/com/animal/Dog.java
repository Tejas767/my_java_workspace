package com.animal;

public class Dog extends Animal   {
	
   public void bark() {
	   System.out.println("Dog barks");
   }
   
   
	public static void main(String[] args) {
	  Dog dog= new Dog();
	  dog.eat();
	  dog.bark();
  
	}

}
