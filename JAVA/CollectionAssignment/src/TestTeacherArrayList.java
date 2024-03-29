import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestTeacherArrayList {
	public static void main(String[] args) {
		
		ArrayList<Teacher> al = new ArrayList<Teacher>();
		
		Teacher t1 = new Teacher(10, "RaviShankar", 15);
		Teacher t2 = new Teacher(20, "Himesh", 23);
		Teacher t3 = new Teacher(30, "Beyonce", 10);
		
		al.add(t1);
		al.add(t2);
		al.add(t3);
		
		System.out.println("==========================Using While loop========================");
		int w=0;
		while(w<al.size()) {
			System.out.println(al.get(w));
			w++;
		}
		
		System.out.println("==========================Using for-loop========================");
		for(int i = 0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("==========================Using for-Each-loop========================");
		for(Teacher e : al) {
			System.out.println(e);
		}
		
		System.out.println("==========================Using Iterator========================");
		Iterator<Teacher> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("==========================Using List-Iterator========================");
		
		ListIterator<Teacher> li =al.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
			
		}
		
	}

}
