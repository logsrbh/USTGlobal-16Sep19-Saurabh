
public class TestB {

	static int b ;
	int a;
	{
		a=10;
		b=20;
		System.out.println("non staic block 1");
	}
	public static void main(String[] args) {

		System.out.println("main started");
		new TestB();
		new TestB();
		System.out.println("main ended");
	}
	{
		System.out.println("non static block 2");
	}
}
