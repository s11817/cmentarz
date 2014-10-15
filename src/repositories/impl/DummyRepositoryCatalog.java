package repositories.impl;

import Domain.Person;

import repositories.*;


public class DummyRepositoryCatalog implements IRepositoryCatalog{
	
	
	
private DummyDb db = new DummyDb();








public IRepository<Person> getPersons() {
	
	
return new DummyPersonRepository(db);


}

}