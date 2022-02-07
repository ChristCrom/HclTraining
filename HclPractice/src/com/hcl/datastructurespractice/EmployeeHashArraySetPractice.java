package com.hcl.datastructurespractice;

import java.util.*;

public class EmployeeHashArraySetPractice {
	public static void main(String[] args) {
		List<Employee> arrayEmp = new ArrayList<>();

		arrayEmp.add(new Employee(1, "Chris", "Austin"));
		arrayEmp.add(new Employee(2, "Brooke", "San Antonio"));
		arrayEmp.add(new Employee(6, "Justin", "Burnet"));
		arrayEmp.add(new Employee(98, "Joel", "New York"));
		arrayEmp.add(new Employee(1, "Chris", "Austin"));
		
		for(Employee l : arrayEmp) {
			System.out.println(l.id + ", " + l.name + ", " + l.city);
		}
		
		System.out.println("\nCan easily add an element and list the whole array again\n");
		arrayEmp.add(new Employee(15, "Thompson", "Llano"));
		
		for(Employee l : arrayEmp) {
			System.out.println(l.id + ", " + l.name + ", " + l.city);
		}
		
		//array list is good for expandable data structure, it can handle duplicates and is good at getting elements at any index. 
		
		Set<Employee> setEmp = new HashSet<>();

		setEmp.add(arrayEmp.get(0));
		setEmp.add(arrayEmp.get(1));
		setEmp.add(arrayEmp.get(2));
		setEmp.add(arrayEmp.get(3));
		setEmp.add(arrayEmp.get(0));
		
		
		System.out.println("\nThis tried to add the first element of the orginal array list twice. As you can see it is not "
				+ "listed twice because it overwrites becuase it is a set list\n");
		for(Employee l : setEmp) {
			System.out.println(l.id + ", " + l.name + ", " + l.city);
		}
		//this will get a unique list of objects. if the object is trying to get added twice then it will not work and just overwrite the value
	
	 
	

	}
}