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
		System.out.println("Creating SavingsAccount ...");
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public void printDescription() {
		System.out.println("A savings account");
		super.printDescription();
		System.out.printf("\tInterest rate (%%): %.02f%n", interestRate);
	}
}
