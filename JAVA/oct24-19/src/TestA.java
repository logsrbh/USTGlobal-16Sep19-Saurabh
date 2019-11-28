
public class TestA {

	static int a ;
	int b;
	static {
		a=20;
		System.out.println("Static Block 1");
	}
	TestA(){
		System.out.println("TestA() constructor");
	}
	
	public static void main(String[] args) {
		new TestA();
		new TestA();
		System.out.println("A value "+a);
	}
	
	static {
		a=20;
		System.out.println("Static Block 2");
	}
	static {
		a=40;
		System.out.println("Static Block 3");
	}
}


