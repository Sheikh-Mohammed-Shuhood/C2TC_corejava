package Day3;

public class Student {
	int id;
	String name;
	
	void display() {
		System.out.println("Id: "+id+"\nName: "+name);
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public void setId(int sid) {
		this.id=sid;
	}
	
	public void setName(String sname) {
		this.name=sname;
	}
	
	public String toString() {
		return "Id: "+id+"\nName: "+name;
	}
}
