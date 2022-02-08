package com.hcl.lambdaandstreampractice;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.function.BiFunction;

class Employee {
	int salary;
	String name;
	int age;

	public Employee(int a, String b, int c) {
		this.salary = a;
		this.age = c;
		this.name = b;
	}
}

class MyDog implements Dog, Beagle {
	public void speakName() {
		Dog.super.speakName();
		Beagle.super.speakName();
		Dog.bark();
		System.out.println("Look at me go!");
	}
}

public class LambdaMain {
	private int operate(int a, int b, MyMathOp myMathOp) {
		return myMathOp.operation(a, b);
	}

	static LambdaMain test = new LambdaMain();

	public static void main(String[] args) {
		MyMathOp addition = (int a, int b) -> a + b;
		MyMathOp subtraction = (a, b) -> a - b;
		MyMathOp modulo = (int a, int b) -> a % b;
		MyMathOp division = (int a, int b) -> a / b;
		MyMathOp multiply = (int a, int b) -> a * b;
		System.out.println("\nThis is my math operation using lambda\n");
		int i = test.operate(15, 5, addition);
		System.out.println(i);
		i = test.operate(15, 5, modulo);
		System.out.println(i);
		i = test.operate(15, 5, multiply);
		System.out.println(i);
		i = test.operate(15, 5, division);
		System.out.println(i);
		i = test.operate(15, 5, subtraction);
		System.out.println(i);

		AppendString message1 = message -> System.out.println("Whats bracken " + message + " `Edited");
		System.out.println("\nThis is my appeneded string message using lambda\n");
		message1.append("brand new whip new mansion");
//--------------------------------------------------------------------------------------------------------------
		List<Integer> aList = new ArrayList<>();
		for (int j = 0; j < 5; j++) {
			aList.add(j);
		}
		System.out.println("\nThis is my arraylist iterated and printed through lambda\n");
		aList.forEach(p -> System.out.println(p));
//-----------------------------------------------------------------------------------------------------------------
		System.out.println("\nThis is my use of default methods creating a dog interface and class\n");
		Dog dog = new MyDog();
		dog.speakName();
//--------------------------------------------------------------------------------------------------------------------
		System.out.println(
				"\nThis is the list printed with only with employees that have given conditions with out Streams\n");
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee(2500, "Brock", 31));
		emps.add(new Employee(950, "Brooke", 42));
		emps.add(new Employee(3600, "Dan", 65));
		emps.add(new Employee(150, "Danika", 28));
		emps.add(new Employee(100000, "Lala", 41));

		Set<Integer> setEmpSal = new HashSet<Integer>();
		for (int num = 0; num < emps.size(); num++) {
			if (emps.get(num).salary > 1000
					&& (emps.get(num).name.startsWith("B") || emps.get(num).name.startsWith("D"))
					&& emps.get(num).age > 30) {
				setEmpSal.add(emps.get(num).salary);
			}

		}
		System.out.println(setEmpSal);

		System.out.println("\nThis is the list printed with only employees that fit conditions using streams\n");

		Set<Integer> streamEmpSal = emps.stream().filter(
				sal -> sal.salary > 1000 && (sal.name.startsWith("B") || sal.name.startsWith("D")) && (sal.age > 30))
				.map(sal -> sal.salary).collect(Collectors.toSet());

		System.out.println(streamEmpSal);

		System.out
				.println("\nThis is the list printed with only employees that fit conditions using parallel streams\n");

		Set<Integer> streamEmpSal1 = emps.parallelStream().filter(
				sal -> sal.salary > 1000 && (sal.name.startsWith("B") || sal.name.startsWith("D")) && (sal.age > 30))
				.map(sal -> sal.salary).collect(Collectors.toSet());

		System.out.println(streamEmpSal1);
//----------------------------------------------------------------------------------------------------------------------------------
		System.out.println("\nThis is my use of an optional class with a string passing it a null value\n");
		String name = null;
		String name2 = "CHRIS";
		Optional<String> opt = Optional.ofNullable(name);
		if (opt.isPresent()) {
			@SuppressWarnings("null")
			String lowercaseString = name.toLowerCase();
			System.out.println(lowercaseString);
		} else
			System.out.println("String Value is Null or not present");

		System.out.println("\nThis is my use of an optional class with a string passing it a value\n");
		Optional<String> opt2 = Optional.ofNullable(name2);
		if (opt2.isPresent()) {
			String lowercaseString = name2.toLowerCase();
			System.out.println(lowercaseString);
		} else
			System.out.println("String Value is Null or not present");
//----------------------------------------------------------------------------------------------------------------------------------------
		System.out.println("\nThis is an example of predicate testing integers\n");
		Predicate<Integer> lesserthan = q -> (q > 4);
		System.out.println(lesserthan.test(21));
		System.out.println(lesserthan.test(3));
//----------------------------------------------------------------------------------------------------------------------------------------
		System.out.println("\nThis is using BiFunction to do simple arthmetic\n");
		BiFunction<Integer, Integer, Integer> additions = (a, b) -> a + b;
		System.out.println("Answer for addition = " + additions.apply(2, 3));
		BiFunction<Integer, Integer, Integer> multiplication = (a, b) -> a * b;
		System.out.println("Answer for Multiplication = " + multiplication.apply(2, 3));

	}

}
