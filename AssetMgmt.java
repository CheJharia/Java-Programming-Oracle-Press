
public class AssetMgmt {
	private SavingsAccount tomSavingsAccount;
	private CheckingAccount iVisionBusinessAccount;
	
	public static void main(String[] args) {
		AssetMgmt manager = new AssetMgmt();
		manager.createAssets();
		manager.printAllAssets();
	}
	
	private void createAssets() {
		tomSavingsAccount = new SavingsAccount();
		tomSavingsAccount.setId(1001);
		tomSavingsAccount.setType("Bank Account");
		tomSavingsAccount.setBankName("Citi Bank");
		tomSavingsAccount.setAccountNumber(526702);
		tomSavingsAccount.setBalance(15450.00f);
		tomSavingsAccount.setInterestRate(3.0f);
		
		iVisionBusinessAccount = new CheckingAccount();
		iVisionBusinessAccount.setId(1002);
		iVisionBusinessAccount.setType("Bank Account");
		iVisionBusinessAccount.setBankName("Bank of America");
		iVisionBusinessAccount.setAccountNumber(24689);
		iVisionBusinessAccount.setBalance(678256.00f);
		iVisionBusinessAccount.setOverdraftLimit(50000.00f);
	}
	
	private void printAllAssets(){
		String lineSeparator = "---------------------------";
		System.out.println(lineSeparator);
		tomSavingsAccount.printDescription();
		System.out.println(lineSeparator);
		iVisionBusinessAccount.printDescription();
		System.out.println(lineSeparator);
	}
}
