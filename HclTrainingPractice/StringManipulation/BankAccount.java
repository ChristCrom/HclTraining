

public class BankAccount {
	int id;
	String name;
	int balance;

	public BankAccount(int a, String b, int c) {
		this.id = a;
		this.name = b;
		this.balance = c;
	}

	public static void Withdraw(int num, BankAccount BankAcc) throws WithdrawExcep {
		int bal = BankAcc.balance;
		if (bal - num < 0)
			throw new WithdrawExcep();
		else
			BankAcc.balance -= num;
		System.out.println("Your Balance after withdrawl is: " + BankAcc.balance);

	}

	public static void main(String[] args) {
		BankAccount bank1 = new BankAccount(1, "Chris", 1000);

		try {
			Withdraw(999, bank1);

		} catch (WithdrawExcep e) {
			e.printStackTrace();
		}
	}

}
