class Stack<T> {
	protected T[] stack = (T[]) new Object[5];
	int ptr = -1; // stack pointer
	
	public T[] getStack(){
		return stack;
	}

	void push(T data) {
		ptr++;
		stack[ptr] = data;
	}

	T pop() {
		return (T) stack[ptr--];
	}
}
