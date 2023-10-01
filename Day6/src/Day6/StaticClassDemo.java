package Day6;

class Outer{
	static int data=10;
	
	static class Inner{
		void msg() {
			System.out.println(data);
		}
		
	}
}
public class StaticClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		o.data=20;

		Outer.Inner i = new Outer.Inner();  
		i.msg();
		
		Outer.Inner i1 = new Outer.Inner();  
		i1.msg();
	}

}
