package Day6;

public class Student {

	private int id;
	private String name;

	private static String college = "ABCD"; 
	
	public Student(int sid, String sname) {
		super();
		this.id = sid;
		this.name = sname;
	}

	public static void modify() {
		college = "XYZ";
	}

	public String toString() {
		return "Student Id = " + id + "\nName = " + name + "\nCollege = " + college;
	}
	
	public static void main(String[] args) {
		System.out.println("In main method");
		Student s1= new Student(1,"absd");
		System.out.println(s1);
		modify();
		System.out.println(s1);
	}
}
