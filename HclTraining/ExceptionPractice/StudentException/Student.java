package StudentException;

import java.util.Scanner;

public class Student {
	int id;
	String name;
	int marks;

	public Student(int a, String b, int c) throws IllegalRangeException {
		if (c < 0 || c > 100) {
			throw new IllegalRangeException();
		}
		this.id = a;
		this.name = b;
		this.marks = c;
	}

	public static void main(String[] args) throws IllegalRangeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name, ID, and marks: ");
		String name = sc.nextLine();
		int id = sc.nextInt();
		int marks = sc.nextInt();

		try {
			new Student(id, name, marks);
		} catch (IllegalRangeException e) {
			e.printStackTrace();
		}

	}

}
