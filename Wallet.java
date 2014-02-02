
public class Wallet {
	private float money;
	
	public Wallet(float money) {
		this.money = money;
	}
	
	public float getMoney() {
		return this.money;
	}

	public void addMoney(float money) {
		this.money += money;
	}
	
	public boolean takeMoney(float money) {
		if (money >= this.money) {
			return false;
		}else {
			this.money -=money;
			return true;
		}
		
	}
}
