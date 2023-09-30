package Day3;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		Customer c2 = new Customer(2,"abc","xyz"); 
		
		c.setCustomerId(1);
		c.setCustomerName("Shuhood");
		c.setCustomerCity("Bangalore");
		
		System.out.println(c);
		System.out.println(c2);
	}

}
