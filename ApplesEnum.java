enum Apple {
	AURORA(10), BELMAC(12), CORTLAND(15), EMPIRE(8), GRAVENSTEIN(11);
	private int price;

	Apple(int price) {
		this.price = price;
	}

	int getPrice() {
		return price;
	}

	public String toString() {
		String s = super.toString();
		return s.substring(0, 1) + s.substring(1).toLowerCase();
	}
}

public class ApplesEnum {

	public static void main(String[] args) {
		System.out.println("Apple price list:");
		for (Apple apple : Apple.values()) {
			System.out.println("\t" + apple + " costs " + apple.getPrice()
					+ " cents.");
		}

		System.out.println("Apple ordinal values(its possiton in the list of constants):");
		for (Apple apple : Apple.values()) {
			System.out
					.println("\t" + "[" + apple + "]" + ":" + apple.ordinal());
		}

	}

}
