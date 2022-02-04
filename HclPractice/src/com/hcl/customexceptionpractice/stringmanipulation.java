package com.hcl.customexceptionpractice;

import java.util.StringTokenizer;

public class stringmanipulation {

	public static void main(String[] args) {
		String origStr = "Christian_Patrick_Cromer";
		String date = "11/24/1997";
		StringTokenizer st = new StringTokenizer(origStr, "_");
		String newStr = st.nextToken("_") + " ";

		while (st.hasMoreTokens()) {
			newStr += (st.nextToken("_") + " ");
		}
		System.out.println(
				"This is my string after getting each token with Tokenizer and using delim '_': \n" + newStr + "\n");

		System.out.println(date);

		StringBuffer strB = new StringBuffer();
		strB.append(newStr);
		strB.append("11/24/1997");
		newStr = strB.toString();
		System.out.println("My new string after adding my birthday with string buffer is: \n" + newStr + "\n");

		System.out.println("This is my String Backwards: \n" + strB.reverse() + "\n");
		// This is to reverse it back
		strB.reverse();

		System.out.println("This is my String with the middle name removed: \n" + strB.delete(10, 18) + "\n");

	}
}