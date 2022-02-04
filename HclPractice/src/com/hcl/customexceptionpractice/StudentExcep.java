package com.hcl.customexceptionpractice;

import java.util.Scanner;

public class StudentExcep {
	int id;
	String name;
	int marks;

	public StudentExcep(int a, String b, int c) throws IllRangeExcep {
		if (c < 0 || c > 100) {
			throw new IllRangeExcep();
		}
		this.id = a;
		this.name = b;
		this.marks = c;
	}

	public static void main(String[] args) throws IllRangeExcep {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name, ID, and marks: ");
		String name = sc.nextLine();
		int id = sc.nextInt();
		int marks = sc.nextInt();

		try {
			new StudentExcep(id, name, marks);
		} catch (IllRangeExcep e) {
			e.printStackTrace();
		}

	}

}
