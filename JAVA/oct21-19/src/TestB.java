
public class TestB {

	public static void main(String[] args) {

		Cow c = new Cow();
		c.color="White";
		c.name="Ganga";
		
		System.out.println("Cow name is "+c.name);
		System.out.println("Cow color is "+c.color);
		
		c.eat();
		c.sleep();
		
		Cow c1 = new Cow();
		c1.color="Black";
		c1.name="Tunga";
		
		System.out.println("Cow name is "+c1.name);
		System.out.println("Cow color is "+c1.color);
		
		c1.eat();
		c1.sleep();
	}

}
