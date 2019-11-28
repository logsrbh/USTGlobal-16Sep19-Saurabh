
public class TestA {
	public static void main(String[] args) {
		Pen p = new Pen();

		p.cost=100;
		p.color="Blue";
		p.brand="Rotomac";

		System.out.println("Cost is "+p.cost);
		System.out.println("Color is "+p.color);
		System.out.println("brand is "+p.brand);

		p.write();

		System.out.println("*********************************************");

		Van v = new Van();
		v.color="White";
		v.cost=250000;

		System.out.println("Van color is "+v.color);
		System.out.println("Van price is "+v.cost);
		v.move();

		Van v1 = new Van();
		v1.color="Blue";
		v1.cost=300000;
		
		System.out.println("Van v1 Color is "+v1.color);
		System.out.println("Van v2 Coor is "+v1.cost);
		v1.move();
	
	}
}
