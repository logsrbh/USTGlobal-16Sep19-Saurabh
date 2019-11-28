
public class Teacher {

	int id;
	String name;
	int yoe;
	
	public Teacher(int id, String name, int yoe) {
		super();
		this.id = id;
		this.name = name;
		this.yoe = yoe;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", yoe=" + yoe + "]";
	}
	
	
}
