public class Person {
	String name;
	private Wallet wallet = new Wallet((float) 500.00);

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Person p = new Person("Che");
		System.out.println(p.name + " saves " + 100.00);
		p.wallet.addMoney((float) 100.00);
		System.out.println("Current balance is " + p.wallet.getMoney());
		System.out.println(p.name + " want to take out " + 300.00);
		if (p.wallet.takeMoney((float) 300.00)) {
			System.out.println("Withdrawal successful");
		} else {
			System.out.println("Nope. Not enough money");
		}
		System.out.println("Current balance is " + p.wallet.getMoney());

	}

}
