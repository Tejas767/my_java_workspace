package com.tka;

public class StudGrade {
    int studId;
    String name;
    String course;
    double percentage;
    
    public StudGrade( int studId,String name,String course, double percentage) {
    	this.studId=studId;
    	this.name=name;
    	this.course=course;
    	this.percentage=percentage;
    	
    	
    	System.out.println("Your roll no. is " + studId);
    	System.out.println("your name is "+name);
    	System.out.println("Your current course "+course);
    	System.out.println("Your percenatge is " + percentage);
    	System.out.println("Your Grade is" + grade());
    	
    }
    
    
    public String  grade() {
    	if (percentage >90 &&  percentage <= 100) {
    		return "Grade A";
    	}
    	else if(percentage >80 &&  percentage <= 90) {	
    		return "Grade B";
    	}
    	else if (percentage >70 &&  percentage <= 80) {
    		return "Grade C";
    	}
    	else if (percentage >60 &&  percentage <= 70) {
    		return "Grade D";
    	}
    	else if(percentage >50 &&  percentage <= 60) {
    		return "Grade E";
    	}
    	else
    		return "You are failed";		
    }
    
	
	
}
