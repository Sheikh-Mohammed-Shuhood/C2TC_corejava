package Package1;

public class Test1 {

	public int id =5;
	public void display() {
		System.out.println("Access Modifiers");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1();
		System.out.println(t1.id);
		t1.display();
	}

}
