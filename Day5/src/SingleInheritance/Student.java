package SingleInheritance;

public class Student extends Citizen{

	private int rollno;
	private String collegeName;

	public Student(String sname, String saadharno, String saddress, long sphone,int srollno, String scollegeName) {
		super(sname, saadharno, saddress, sphone);
		this.rollno = srollno;
		this.collegeName = scollegeName;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int srollno) {
		this.rollno = srollno;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	
	public void setCollegeName(String scollegeName) {
		this.collegeName = scollegeName;
	}

	public String toString() {
		return "Student Roll No = " + rollno + "\nCollege Name = " + collegeName + "\ngetName()=" + getName()
				+ "\ngetAadharno()=" + getAadharno() + "\ngetAddress()=" + getAddress() + "\ngetPhone()=" + getPhone();
	}
}
