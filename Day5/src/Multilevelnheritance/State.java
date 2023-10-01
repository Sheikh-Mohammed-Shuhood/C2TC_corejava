package Multilevelnheritance;

public class State extends Country {
	
	private String stateName;
	private String language;

	public String getStateName() {
		return stateName;
	}
	public void setStateName(String sstateName) {
		this.stateName = sstateName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String slanguage) {
		this.language = slanguage;
	}

	public String toString() {
		return "State Name = " + stateName + "\nLanguage = " + language + "\ngetCountryName() = " + getCountryName()
				+ "\ngetCapital() = " + getCapital();
	}
}
