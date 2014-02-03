public class PortfolioManager {
	Asset[] myAssets = new Asset[5];

	public static void main(String[] args) {
		PortfolioManager manager = new PortfolioManager();
		manager.createAssets();
		manager.printAllAssets();
		manager.printNetWorth();
	}

	public void createAssets() {
		SavingsAccount mySavingsAccount = new SavingsAccount();
		mySavingsAccount.setId(1001);
		mySavingsAccount.setType("Bank Account");
		mySavingsAccount.setBankName("Citi Bank");
		mySavingsAccount.setAccountNumber(5453030);
		mySavingsAccount.setBalance(134234.00f);
		mySavingsAccount.setInterestRate(3.0f);
		myAssets[0] = mySavingsAccount;

		CheckingAccount iVisionBusinessAccount = new CheckingAccount();
		iVisionBusinessAccount.setId(1002);
		iVisionBusinessAccount.setType("Bank Account");
		iVisionBusinessAccount.setBankName("Bank of America");
		iVisionBusinessAccount.setAccountNumber(4123410);
		iVisionBusinessAccount.setBalance(412234.00f);
		iVisionBusinessAccount.setOverdraftLimit(500000.00f);
		myAssets[1] = iVisionBusinessAccount;
		
		Stock ibmStocks = new Stock();
		ibmStocks.setId(5001);
		ibmStocks.setType("Security");
		ibmStocks.setTradeExchangeName("NYSE");
		ibmStocks.setSymbol("IBM");
		ibmStocks.setQuantityAtHand(100);
		ibmStocks.setMarketPrice(129.61f);
		myAssets[2] = ibmStocks;
		
		Bond applBonds = new Bond();
		applBonds.setId(6000);
		applBonds.setType("Bonds");
		applBonds.setTradeExchangeName("NYSE");
		applBonds.setName("Apple Inc");
		applBonds.setInvestedAmount(25000.00f);
		applBonds.setMaturityDate("01/01/2014");
		myAssets[3] = applBonds;
		
		RealEstate texasEstate = new RealEstate();
		texasEstate.setId(8000);
		texasEstate.setType("Real Estate");
		texasEstate.setName("House in Texas");
		
		texasEstate.setBuiltUpArea(2250);
		texasEstate.setCurrentMarketRate(950.00f);
		myAssets[4] = texasEstate;
	}
	
	private void printAllAssets(){
		String lineSeparator = "------------------------------";
		System.out.println("Entire Portfolio");
		for (Asset asset : myAssets) {
			System.out.println(lineSeparator);
			asset.printDescription();
		}
		System.out.println(lineSeparator);
	}
	
	private void printNetWorth(){
		float total = 0;
		for (Asset asset : myAssets) {
			total += asset.getNetWorth();
		}
		System.out.println("Net Worth of of entire porfolio : $" + total);
	}

}
