
public class TestC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Person.color="White";
    Person.sleep();
    System.out.println("Person color "+Person.color);
    
    System.out.println("*********************************");
    
    Person p1 =new Person();
    p1.age=20;
    p1.name="Divya";
 
    System.out.println("Person p1 age "+p1.age);
    System.out.println("Person p1 nmae "+p1.name);
    p1.color ="black";
    p1.sleep();
	
	Person p2 = new Person();
	p2.age=25;
	p2.name= "Bhvya";
	
	System.out.println("Person p2 age "+p2.age);
    System.out.println("Person p2 nmae "+p2.name);
	}

}
