package repositories.impl;

import java.util.*;

import Domain.Accommodation;
import Domain.Fees;
import Domain.GuardianOfTheTomb;
import Domain.Person;

public class DummyDb {
	
	public List<Person> persons;
	public List<Fees> feeses;
	public List<GuardianOfTheTomb> guardians;
	public List<Accommodation> accommodations;
	
	
	
	
	

	public DummyDb()
	{
		persons = new ArrayList<Person>();
		feeses = new ArrayList<Fees>();
		guardians = new ArrayList<GuardianOfTheTomb>();
		accommodations = new ArrayList<Accommodation>();
		
		
		
		
	}
	

}
