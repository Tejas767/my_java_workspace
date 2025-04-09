package table;

import java.util.Scanner;

public class Table {
    
     public void table() {
    	 Scanner sc= new Scanner(System.in);
     	
     	
     	System.out.println("Enter Your number");
         int tb=sc.nextInt();
        
         for (int i=1;i<=10;i++) {
         	System.out.println(tb + "*" + i + "=" + i*tb);
         	sc.close();
         
     }
    
      }
     }
     
       

