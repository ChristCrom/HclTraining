package jdbc;

import java.sql.*;
import java.util.Scanner;
import java.util.logging.Logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;



public class Driver {
     private static final org.apache.log4j.Logger lg = LogManager.getLogger(Driver.class);
	public static void main(String[] args) throws ClassNotFoundException {
		BasicConfigurator.configure();
		lg.setLevel(Level.ALL);
		lg.info("Program Running");
		
		 int c = 1;
		 Scanner sc = new Scanner(System.in);
		 while(c == 1) {
			
			System.out.println("Please enter the choise by putting the according number with these selections\n"
					+ "1: Insert Employee\n"
					+ "2: Find employees by Conditions\n"
					+ "3: Find all employees in Table\n"
					+ "4: Find salary of all employees\n"
					+ "5: Update Salary of employee by name\n"
					+ "6: Remove Employee by name\n");
			
			int a = sc.nextInt();
			
			switch(a) {
			case 1:
				DBInsert.DBInser();
				break;
			case 2:
				DBSelectCond.DBSelectCon();
				break;
			case 3:
				DBSelectAll.DBSelectAl();
				break;
			case 4:
				SelectSal.DBSelectSalary();
				break;
			case 5:
				DBUpdate.DBUpdat();
				break;
			case 6:
				DBDelete.DBDelet();
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
			 lg.info("Program Stopped");
			 System.exit(0);
		 }
	
	}
}
