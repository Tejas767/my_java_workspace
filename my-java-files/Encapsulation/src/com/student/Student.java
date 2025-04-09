package com.student;

public class Student {

	public static void main(String[] args) {
		Studinfo std=new Studinfo();
		
		std.setAge(20);
		std.setGender("male");
		std.setRoll_num(1);
		std.setStudname("tejas aher");
		
		System.out.println(std.getAge());
		System.out.println(std.getGender());
		System.out.println(std.getRoll_num());
		System.out.println(std.getStudname());
	}

}
