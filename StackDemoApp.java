import java.math.BigDecimal;

public class StackDemoApp {

	public static void main(String[] args) {
		// long type stack
		System.out.println("Creating long stack");
		Stack<Long> longStack = new Stack<Long>();
		System.out.println("Pushing 5");
		longStack.push(5L);
		System.out.println("Pushing 10");
		longStack.push(10L);
		System.out.println("Emptying long stack");
		System.out.println(longStack.pop());
		System.out.println(longStack.pop());
		System.out.println();
		
		// float type stack
		System.out.println("Creating float stack");
		Stack<Float> floatStack = new Stack<Float>();
		System.out.println("Pushing 5.0");
		floatStack.push(5.0f);
		System.out.println("Pushing 10.0");
		floatStack.push(10.0f);
		System.out.println("Emptying float stack");
		System.out.println(floatStack.pop());
		System.out.println(floatStack.pop());
		System.out.println();
		
		// BigDecimal type attack
		System.out.println("Creating BigDecimal stack");
		Stack<BigDecimal> bigDecimalStack = new Stack<BigDecimal>();
		System.out.println("Pushing 12.5E+7");
		bigDecimalStack.push(new BigDecimal(12.5E+7));
		System.out.println("Pushing 125");
		bigDecimalStack.push(new BigDecimal(1244));
		System.out.println("Emptying BigDecimal stack");
		System.out.println(bigDecimalStack.pop());
		System.out.println(bigDecimalStack.pop());
		System.out.println();
		
		// stack without using generics
		Stack oldtypeStack = new Stack();
		oldtypeStack.push(10L);
		oldtypeStack.push("String data");
		for (int i = 0; i < 2; i++) {
			String str = (String) oldtypeStack.pop();
			System.out.println(str);
		}
		int n = 100;
		
	}

}
