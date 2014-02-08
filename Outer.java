class Outer {
	private int size = 10;
	private int a = 20;

	class Inner {
		private int size = 20;

		public void someMethod(int size, final int b) {
			System.out.println("Method parameter (size): " + size);
			System.out.println("Inner size: " + this.size);
			System.out.println("Outer size: " + Outer.this.size);

			class InnerInner {
				int c = 30;

				public void innerMethod() {
					System.out.println("Formal parameter (B): " + b);
					System.out.println("Outer Class variable (A): " + a);
					System.out.println("InnerInner Class variable (C): " + c);
				}
			}
			new InnerInner().innerMethod();
		}
	}
}