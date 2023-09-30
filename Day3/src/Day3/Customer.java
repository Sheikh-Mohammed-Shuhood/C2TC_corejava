package Day3;

public class Customer {
	int CustomerId;
	String CustomerName;
	String CustomerCity;

	public Customer()
	{
	}
	
	public Customer(int cid, String cname, String ccity) {
		CustomerId=cid;
		CustomerName=cname;
		CustomerCity=ccity;
	}
	
	public void setCustomerId(int cid) {
		this.CustomerId=cid;}
	
	public void setCustomerName(String cname) {
		this.CustomerName=cname;}
	
	public void setCustomerCity(String ccity) {
		this.CustomerCity=ccity;}
	
	public String toString() {
		return "Customer id = "+CustomerId+"\nCustomer name = "+CustomerName+"\nCustomer city = "+CustomerCity;
	}
}
