package HierarchialInhertance;

public class Person {

	private int age;
	private String gender;

	public int getAge() {
		return age;
	}
	public void setAge(int page) {
		this.age = page;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String pgender) {
		this.gender = pgender;
	}

	public String toString() {
		return "Person Age = " + age + "\nGender = " + gender;
	}
}
