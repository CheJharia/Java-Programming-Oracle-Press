
public class Bond extends Security {
	private String name, maturityDate;
	private float investedAmount;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setInvestedAmount(float investedAmount) {
		this.investedAmount = investedAmount;
	}
	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}
	
	public void printDescription() {
		System.out.println("Investements in Bonds");
		super.printDescription();
		System.out.println("\tBond name: " + name);
		System.out.printf("\tInvested Amount: $%.02f%n", investedAmount);
		System.out.println("\tMaturity Date: " + maturityDate);
	}
	
	public float getNetWorth(){
		return investedAmount;
	}
}
