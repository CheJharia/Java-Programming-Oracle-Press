public class SavingsAccount extends BankAccount {
	private float interestRate;

	public SavingsAccount() {
		super();
		System.out.println("Creating SavingsAccount ...");
	}

	public SavingsAccount(float interestRate, String bankName,
			int accountNumber, float balance, int id, String type) {
		super(bankName, accountNumber, balance, id, type);
		this.interestRate = interestRate;
	}
	
	public SavingsAccount(String bankName, int accountNumber) {
		this(5.0f, bankName, accountNumber, 0, 10001, "Bank Account");
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public void printDescription() {
		System.out.println("A saving account:");
		super.printDescription();
		System.out.printf("\tInterest rate (%%): %.02f%n", interestRate);
	}
}
