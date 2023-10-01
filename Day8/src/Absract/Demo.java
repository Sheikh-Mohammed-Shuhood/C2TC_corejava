package Absract;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square s =new Square();
		s.side=5;
		s.calcArea();
		s.show();
		
		Rectangle r = new Rectangle();
		r.l=10;
		r.b=20;
		r.calcArea();
		r.show();
	}

}
