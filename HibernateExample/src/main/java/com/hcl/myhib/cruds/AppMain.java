package com.hcl.myhib.cruds;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
		Operations op = new Operations();
	 int c = 1;
	 Scanner sc = new Scanner(System.in);
	 while(c == 1) {
		
		System.out.println("Please enter the choise by putting the according number with these selections\n"
				+ "1: Insert Student\n"
				+ "2: Find Student by Id\n"
				+ "3: Find all Students in Table\n"
				+ "4: Find email of student by Id\n"
				+ "5: Update email of student by Id\n"
				+ "6: Remove student by Id\n");
		
		int a = sc.nextInt();
		
		switch(a) {
		case 1:
			op.insertEntity();
			break;
		case 2:
			op.findEntity();
			break;
		case 3:
			op.findEntityAll();
			break;
		case 4:
			op.findEmail();
			break;
		case 5:
			op.updateEntity();
			break;
		case 6:
			op.removeEntity();
			break;
		default:
			System.out.println("Please enter a valid Choice:");
			continue;
			
		}
	   
	  System.out.println("Do you want to do another query? 1 for yes or 2 for no");
	  sc = new Scanner(System.in);
	  c = sc.nextInt();
	 

	}
	 sc.close();
	 if(c !=1) {
		 System.exit(0);
	 }
	 
	 
	 
	}
}
