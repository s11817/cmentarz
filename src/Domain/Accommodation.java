package Domain;

public class Accommodation extends Person  {
	
	String sector;
	int nrOfGrave;
	int sinceWhen;
	int forWhen;
	
	
	private Person person;
	//private Fees fees;

	
	
	
	
	public String getSector() {
		return sector;
	}

	public int getSinceWhen() {
		return sinceWhen;
	}

	public void setSinceWhen(int sinceWhen) {
		this.sinceWhen = sinceWhen;
	}

	public int getForWhen() {
		return forWhen;
	}

	public void setForWhen(int forWhen) {
		this.forWhen = forWhen;
	}

	public void setSector(String string) {
		this.sector = string;
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
