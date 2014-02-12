public class Animal {
	void saySomething() {
		System.out.println("Animal talking");
	}
}

class Cat extends Animal {
	@Override
	void saySomething() {
		System.out.println("meow ... meow");
	}
}
