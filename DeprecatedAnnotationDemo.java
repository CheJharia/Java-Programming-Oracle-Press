public class DeprecatedAnnotationDemo {

	public static void main(String[] args) {
		MyTestClass testObject = new MyTestClass();
		testObject.doSomething("Hello World");
		testObject.doSomethingNew("Hello World");
	}
}

class MyTestClass {
	@Deprecated
	public void doSomething(String SomeFun) {
		System.out.println(SomeFun);
	}

	public void doSomethingNew(String SomeFun) {
		System.out.println(SomeFun);
	}
}