public class TypeWrapperApp {

	public static void main(String[] args) {
		// object construction
		Integer n1 = new Integer(5);
		Integer n2 = new Integer("10");

		// object value
		System.out.println("n1 holds value: " + n1.intValue());
		System.out.println("n2 holds value: " + n2.intValue());

		// object equality
		System.out.println(n1 + " = " + n2 + " is " + n1.equals(n2));

		// object comparison
		System.out.println(n1 + " compared to " + n2 + " returns "
				+ n1.compareTo(n2));
		System.out.println(n2 + " compared to " + n1 + " returns "
				+ n2.compareTo(n1));

		// parsing a string
		System.out.println("The string holds int value: "
				+ Integer.parseInt("245"));
		System.out.println("The string holds int value: "
				+ Integer.parseInt("FF", 16));
		System.out.println("The string holds int value: "
				+ Integer.parseInt("100", 8));
		System.out.println("The string holds int value: "
				+ Integer.parseInt("Jim", 27));

		// rotateRight(),rotateLeft()
		Integer b1 = new Integer(9);
		Integer b2 = new Integer(8);
		System.out.println(Integer.toBinaryString(b1) + ":"
				+ Integer.toBinaryString(b2));
		b1 = Integer.rotateLeft(b1, 2);
		b2 = Integer.rotateRight(b2, 1);
		System.out.println(Integer.toBinaryString(b1) + ":"
				+ Integer.toBinaryString(b2));
	}

}
