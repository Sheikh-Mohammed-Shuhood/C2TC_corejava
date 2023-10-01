package Multilevelnheritance;

public class Country {

	private String countryName;
	private String capital;

	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String ccountryName) {
		this.countryName = ccountryName;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String ccapital) {
		this.capital = ccapital;
	}

	public String toString() {
		return "Country Name = " + countryName + "\nCapital = " + capital;
	}
}
