package Overriding;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RBI r =new RBI();
		System.out.println(r.rateofinterest());	
		
		SBI s=new SBI();
		System.out.println(s.rateofinterest());
		
		RBI i = new ICICI();
		System.out.println(i.rateofinterest());
	}

}
