package Domain;
//import java.util.Date;   //nie uzywane


public class Person extends Entity{

	String name;
	String Surname;
	int yearOfDeath;
	int monthOfDeath;
	int dayOfDeath;
	
	
	
	

	Accommodation accommodation;
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public void getDateOfDeath() {
		System.out.println(yearOfDeath+"-"+monthOfDeath+"-"+dayOfDeath);
		return;
	}
	public void setDateOfDeath(int year, int month, int day) {
		this.yearOfDeath = year;
		this.monthOfDeath = month;
		this.dayOfDeath = day;
	}
	
	
	
	
	
	
}
