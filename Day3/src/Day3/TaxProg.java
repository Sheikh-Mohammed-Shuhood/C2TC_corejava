package Day3;

import java.util.Scanner;

public class TaxProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);  
		
		System.out.println("Enter your name:");
		String name = in.nextLine();
		
		System.out.println("Enter your gender:");
		String gender = in.next();
		
		System.out.println("Enter your age:");
		int age = in.nextInt();
		
		System.out.println("Enter your income:");
		int income = in.nextInt();
		
		in.close();
		
		Person p = new Person();
		p.setName(name);
		p.setGender(gender);
		p.setAge(age);
		p.setIncome(income);
		
		TaxCalculation TaxCal = new TaxCalculation();
		TaxCal.CalculateTax(p);
		
		System.out.println("Tax calculation");
		System.out.println(p.getTax());
		
	}

}
