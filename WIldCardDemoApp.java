public class WIldCardDemoApp {
	public static void main(String[] args) {
		System.out.println("Creating long stack");
		NumberStack<Long> longStack = new NumberStack<Long>();
		longStack.push(5L);
		longStack.push(10L);

		System.out.println("Creating Number stack");
		NumberStack<Number> numberStack = new NumberStack<Number>();
		numberStack.push(10L);
		System.out.println("\nDumping long stack");
		dumpStack(longStack);
		System.out.println("\nDumping Number stack");
		dumpStack(numberStack);
	}

	private static void dumpStack(NumberStack<?> stack) {
		for (Number n : stack.getStack()) {
			System.out.println(n);
		}
	}

}
