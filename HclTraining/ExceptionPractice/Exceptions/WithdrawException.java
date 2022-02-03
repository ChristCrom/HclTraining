package Exceptions;

public class WithdrawException extends Exception {
	public WithdrawException() {
		System.out.println("Cannot Withdraw that amount due to insufficeint funds");
	}

	public String toString() {
		return "WithdrawException Object : Balance can't be less than zero after withdraw";
	}

}
