package Day3;

import java.util.Scanner;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		Student s1= new Student();
		s1.setId(1);
		s1.setName("Shuhood");
		System.out.println("Enter greeting");
		String greet= in.nextLine();
		System.out.println(greet);
		System.out.println(s1);
		in.close();
	}

}
