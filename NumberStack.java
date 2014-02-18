public class NumberStack<T extends Number> {
	protected Number[] stack = new Number[5];
	int ptr = -1; // stack pointer

	public Number[] getStack(){
		return stack;
	}
	
	// T is a subclass of Number
	void push(T data) {
		ptr++;
		stack[ptr] = data;
	}

	T pop() {
		return (T) stack[ptr--];
	}

}
