package HierarchialInhertance;

public class Employee extends Person {

	private int empId;
	private float salary;

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int eempId) {
		this.empId = eempId;
	}
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float esalary) {
		this.salary = esalary;
	}

	public String toString() {
		return "Employee Id = " + empId + "\nSalary = " + salary + "\ngetAge() = " + getAge() + "\ngetGender() = "
				+ getGender();
	}
}
