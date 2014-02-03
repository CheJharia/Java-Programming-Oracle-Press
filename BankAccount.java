public class BankAccount extends Asset {
	private String bankName;
	private int accountNumber;
	private float balance;

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
