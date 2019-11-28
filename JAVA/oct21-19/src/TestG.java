
public class TestG {

	public static void main(String[] args) {
		
		FirstGen fg = new FirstGen();
		fg.call();
		fg.msg();
		System.out.println("***************************");
		
		SecondGen sg = new SecondGen();
		sg.call();
		sg.msg();
		sg.games();
		System.out.println("***************************");
		
		ThirdGen tg = new ThirdGen();
		tg.call();
		tg.msg();
		tg.games();
		tg.camera();		
	}
}
