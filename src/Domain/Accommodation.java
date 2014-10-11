package Domain;

public class Accommodation extends Person  {
	
	char sector;
	int nrOfGrave;
	
	private Person person;
	//private Fees fees;

	
	
	
	
	public char getSector() {
		return sector;
	}

	public void setSector(char sector) {
		this.sector = sector;
	}

	public int getNrOfGrave() {
		return nrOfGrave;
	}

	public void setNrOfGrave(int nrOfGrave) {
		this.nrOfGrave = nrOfGrave;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	

}
