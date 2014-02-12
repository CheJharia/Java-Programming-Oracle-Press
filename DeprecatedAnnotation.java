public class DeprecatedAnnotation {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) {
		java.io.StringBufferInputStream is = new java.io.StringBufferInputStream(
				"A sample string");
	}
}
