
public class Student {

	private String name;
	private int ID;
	private boolean sit;

	public Student(String name, int ID) {
		this.ID = ID;
		this.name = name;
		sit = false;
	}

	public void sit() {
		this.sit = true;
	}

	public void change() {
		// 改變心意，想要坐別的地方
	}

	public void leave() {
		this.sit = false;
	}

	public boolean getSit() {
		return this.sit;
	}

}
