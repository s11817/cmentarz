package repositories.impl;

import Domain.Accommodation;
import Domain.GuardianOfTheTomb;
import Domain.Person;
import repositories.*;


public class DummyRepositoryCatalog implements IRepositoryCatalog{
	
	
	
private DummyDb db = new DummyDb();



public IRepository<Person> getPersons() {
	
	return new DummyPersonRepository(db);

}



public IRepository<GuardianOfTheTomb> getGuardianOfTheTomb() {

	return new DummyGuardianOfTheTombRepository(db);
}



public IRepository<Accommodation> getAccommodation() {
	
	return new DummyAccommodationRepository(db);
}

}