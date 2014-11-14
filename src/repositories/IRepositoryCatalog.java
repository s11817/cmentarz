package repositories;

import Domain.Accommodation;
import Domain.Grave;
import Domain.GuardianOfTheTomb;
import Domain.Person;

public interface IRepositoryCatalog {
	
	
	public IRepository<Person> getPersons();
	public IRepository<GuardianOfTheTomb> getGuardianOfTheTomb();
	public IRepository<Accommodation> getAccommodation();
	public IRepository<Grave> getGrave();
	
	
	
	

}
