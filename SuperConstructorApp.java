public class SuperConstructorApp {

	public static void main(String[] args) {
		String lineseparator = "-------------------------";
		SavingsAccount barSavingsAccount = new SavingsAccount();
		SavingsAccount fooSavingsAccount = new SavingsAccount(4.0f, "AMEX",
				20123, 500.00f, 2003, "Bank Account");
		SavingsAccount blaSavingsAccount = new SavingsAccount("HSBC", 2002);
		System.out.println(lineseparator);
		System.out.println("My savings account");
		barSavingsAccount.printDescription();
		System.out.println("Foo's saving account");
		fooSavingsAccount.printDescription();
		System.out.println(lineseparator);
		blaSavingsAccount.printDescription();
		System.out.println(lineseparator);		
		
	}
}
