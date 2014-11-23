package Domain;

import java.util.Date;

public class Accommodation extends Person  {
	
	char sector;
	int nrOfGrave;
	Date forWhen;
	
	
	private Person person;
	//private Fees fees;
/*public Accommodation() {
	setPerson(person);
	nrOfGrave = 1;
	sector = "A";
	sinceWhen = 2003;
	forWhen = 2015;
	setId(1);
	
	}*/
	
	
	public char getSector() {
		return sector;
	}

	
	


	public Date getForWhen() {
		return forWhen;
	}


	public void setForWhen(Date forWhen) {
		this.forWhen = forWhen;
	}


	public void setSector(char string) {
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
