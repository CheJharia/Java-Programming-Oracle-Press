public class BankAccount extends Asset {
	private String bankName;
	private int accountNumber;
	private float balance;

	public BankAccount() {
		System.out.println("Creating BankAccount ...");
	}

	public BankAccount(String bankName, int accountNumber, float balance,
			int id, String type) {
		super(id, type);
		this.bankName = bankName;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void printDescription() {
		System.out.println("\tName: " + bankName);
		super.printDescription();
		System.out.printf("\tAccount #: %d%n", accountNumber);
		System.out.printf("\tCurrent balance: $%.02f%n", balance);

	}

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setId(20);
		System.out.println(bankAccount.getId());

	}

}
