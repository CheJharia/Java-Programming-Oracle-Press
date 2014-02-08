class ShadowedVariableExample{
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.someMethod(5, 0);
	}
}