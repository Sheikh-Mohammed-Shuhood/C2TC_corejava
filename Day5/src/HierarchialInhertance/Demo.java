package HierarchialInhertance;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setAge(20);
		s1.setGender("Male");
		s1.setRollNo(100);
		s1.setStudentName("ABCD");
		
		System.out.println(s1);
		
		Employee e1 = new Employee();
		e1.setAge(56);
		e1.setEmpId(200);
		e1.setGender("Female");
		e1.setSalary(50000);

		System.out.println(e1);
		
	}

}
