public class SavingsAccount extends BankAccount {
	private float interestRate;

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public void printDescription() {
		System.out.println("A savings account");
		super.printDescription();
		System.out.printf("\tInterest rate (%%): %.02f%n", interestRate);
	}
}


