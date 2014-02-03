public class CheckingAccount extends BankAccount {
	private float overdraftLimit;

	public void setOverdraftLimit(float overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public void printDescription() {
		System.out.println("A checking account");
		super.printDescription();
		System.out.printf("\tOverdraft limit: $%.02f%n", overdraftLimit);
	}
}
