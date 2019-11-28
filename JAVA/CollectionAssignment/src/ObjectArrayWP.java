
public class ObjectArrayWP {
	public static void main(String[] args) {
		
		Primitive obj[] = new Primitive[2];
		
		obj[0] = new Primitive(1,5.0,'A',true);
		obj[1] = new Primitive(2,10.0,'b',false);
		
		System.out.println("================Using for-loop==============");
		for(int i=0; i<obj.length; i++) {
			System.out.println(obj[i]);
		}
		
		System.out.println("===============Using for-each loop============");
		
		for(Object o: obj) {
			System.out.println(o);
		}
		
		Student st[] = new Student[5];
		
		st[0] = new Student(10, "Dinga",16.8 );
		st[1] = new Student(20, "Dingi",25.5 );
		st[2] = new Student(30, "Tinga",34.6 );
		st[3] = new Student(40, "Minga",43.7 );
		st[4] = new Student(50, "Einga",52.1 );
		
		
		System.out.println("================Using for-loop==============");
		for(int i=0; i<st.length; i++) {
			System.out.println(st[i]);
		}
		
		System.out.println("===============Using for-each loop============");
		
		for(Object o: st) {
			System.out.println(o);
		}
		
	}

}
