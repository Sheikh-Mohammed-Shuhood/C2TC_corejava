package Multilevelnheritance;

public class City extends State {

	private String cityName;
	private String area;

	public String getCityName() {
		return cityName;
	}
	public void setCityName(String ccityName) {
		this.cityName = ccityName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String carea) {
		this.area = carea;
	}
	

	public String toString() {
		return "City Name = " + cityName + "\nArea = " + area + "\ngetStateName() = " + getStateName()
				+ "\ngetLanguage()=" + getLanguage();
	}
}
