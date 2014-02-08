public class OuterClass {
	public OuterClass() {
		// declaring another class inside a method
		class Local{
			public Local() {
				// local class constructor code here
			}
		}
		new Local();
		
	}
	
	public void instanceMethod(){
		new OuterClass();
	}
}
