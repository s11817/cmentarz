package repositories;

import Domain.Person;

public interface IRepositoryCatalog {
	
	//public IPersonRepository getPersons();
	public IRepository<Person> getPersons();
	

}
