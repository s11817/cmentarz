package repositories;

import Domain.Accommodation;
import Domain.GuardianOfTheTomb;
import Domain.Person;

public interface IRepositoryCatalog {
	
	//public IPersonRepository getPersons();
	public IRepository<Person> getPersons();
	public IRepository<GuardianOfTheTomb> getGuardianOfTheTomb();
	public IRepository<Accommodation> getAccommodation();
	
	
	

}
