package BankException;

import Exceptions.WithdrawException;

public class BankAccount {
	int id;
	String name;
	int balance;

	public BankAccount(int a, String b, int c) {
		this.id = a;
		this.name = b;
		this.balance = c;
	}

	public static void Withdraw(int num, BankAccount BankAcc) throws WithdrawException {
		int bal = BankAcc.balance;
		if (bal - num < 0)
			throw new WithdrawException();
		else
			BankAcc.balance -= num;

	}

	public static void main(String[] args) {
		BankAccount bank1 = new BankAccount(1, "Chris", 1000);

		try {
			Withdraw(1100, bank1);

		} catch (WithdrawException e) {
			e.printStackTrace();
		}
	}

}
