package Overloading;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		Demo d2 = new Demo(1.0f,2.0f);
		
		System.out.println(d);
		System.out.println(d2);

		System.out.println(	MethodOverloading.addition(5,6));
		System.out.println(	MethodOverloading.addition(1.0f,2.0f));
		System.out.println(	MethodOverloading.addition(20.0,20.0));
	}

}
