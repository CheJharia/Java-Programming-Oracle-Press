public class StaticMemberTestApp {

	private static int i;
	private int j;

	public static void staticMethod() {
		// do something
	}

	public void nonStaticMethod() {
		// do something
	}

	public static void main(String[] args) {
		i = 5;
//		j = 10; // this does not compile
				// because j is an instance field
		staticMethod();
//		nonStaticMethod();// illegal call
				// because a non static method can only
				// be called from an instance of the class
	}

}
