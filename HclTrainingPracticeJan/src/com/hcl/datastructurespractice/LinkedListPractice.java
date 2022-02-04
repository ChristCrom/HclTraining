package com.hcl.datastructurespractice;
import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();

		list1.add(1);
		list1.add(2);
		list1.add(13);
		list1.add(14);
		list1.add(15);
		list1.add(16);
		list1.add(17);

		System.out.println(list1);

		list1.addFirst(101);
		list1.addLast(101);

		System.out.println(list1);

		list1.removeFirst();
		list1.removeLast();

		System.out.println(list1);

		System.out.println(list1.getFirst());
		System.out.println(list1.getLast());

	}

}
