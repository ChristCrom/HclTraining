package com.hcl.customexceptionpractice;

public class WithdrawExcep extends Exception {
	public WithdrawExcep() {
		System.out.println("Cannot Withdraw that amount due to insufficeint funds");
	}

	public String toString() {
		return "WithdrawException Object : Balance can't be less than zero after withdraw";
	}


}