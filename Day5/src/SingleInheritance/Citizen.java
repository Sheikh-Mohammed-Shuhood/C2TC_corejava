package SingleInheritance;

public class Citizen {

	private String name;
	private String aadharno;
	private String address;
	private long phone;

	public Citizen() {
		super();
	}

	public Citizen(String cname, String caadharno, String caddress, long cphone) {
		super();
		this.name = cname;
		this.aadharno = caadharno;
		this.address = caddress;
		this.phone = cphone;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String cname) {
		this.name = cname;
	}
	
	public String getAadharno() {
		return aadharno;
	}
	
	public void setAadharno(String caadharno) {
		this.aadharno = caadharno;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String caddress) {
		this.address = caddress;
	}
	
	public long getPhone() {
		return phone;
	}
	
	public void setPhone(long cphone) {
		this.phone = cphone;
	}
	

	public String toString() {
		return "Citizen Name = " + name + "\nAaadhar No. = " + aadharno + "\nAddress = " + address + "\nPhone No. = " + phone;
	}
}
