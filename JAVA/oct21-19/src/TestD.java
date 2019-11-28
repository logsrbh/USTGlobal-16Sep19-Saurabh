
public class TestD {

	public static void main(String[] args) {

		Btm m = new Btm();
		m.swipe();
		int count =m.getCount();
	    int totalCount=	m.getTotalCount();
		
	    System.out.println("Count = "+count);
		System.out.println("Total Count = "+totalCount);
	}

}
