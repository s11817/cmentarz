package Domain;

public class GuardianOfTheTomb {
	
	
	String nameOfGuardian;
	String surnameOfGuardian;
	int nrTelOfGuardian;
	
	Person person = new Person();
	
	

	public String getNameOfGuardian() {
		return nameOfGuardian;
	}

	public void setNameOfGuardian(String nameOfGuardian) {
		this.nameOfGuardian = nameOfGuardian;
	}

	public String getSurnameOfGuardian() {
		return surnameOfGuardian;
	}

	public void setSurnameOfGuardian(String surnameOfGuardian) {
		this.surnameOfGuardian = surnameOfGuardian;
	}

	public int getNrTelOfGuardian() {
		return nrTelOfGuardian;
	}

	public void setNrTelOfGuardian(int nrTelOfGuardian) {
		this.nrTelOfGuardian = nrTelOfGuardian;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}	
	
	
	

}
