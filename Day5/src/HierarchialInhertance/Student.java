package HierarchialInhertance;

public class Student extends Person{
	
	private int rollNo;
	private String studentName;

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int srollNo) {
		this.rollNo = srollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String sstudentName) {
		this.studentName = sstudentName;
	}
	
	public String toString() {
		return "Student RollNo = " + rollNo + "\nName = " + studentName + "\ngetAge() = " + getAge()
				+ "\ngetGender() = " + getGender();
	}
}
