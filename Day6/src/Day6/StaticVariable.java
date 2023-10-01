package Day6;

public class StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1,"absd");
		System.out.println(s1);

		Student s2 = new Student(2,"asdf");
		System.out.println(s2);
		s2.modify();

		Student s3 = new Student(3,"hello");
		System.out.println(s3);
	}

}
