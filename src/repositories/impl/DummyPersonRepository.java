package repositories.impl;

import java.util.List;

import Domain.Person;
import repositories.IRepository;

public class DummyPersonRepository implements IRepository<Person> {

	
	
	private DummyDb db;
	
	
	
	
	public DummyPersonRepository(DummyDb db) {
		super();
		this.db = db;
	}


	
	
	
	public void add(Person entity) {
		db.persons.add(entity);
		
	}

	public void update(Person entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Person entity) {
		db.persons.remove(entity);
		
	}

	public Person get(int id) {
		for(Person p : db.persons)
		{
			if(p.getId()==id)
				return p;
				
			
		}
		return null;
	}

	public List<Person> getAll() {
		// TODO Auto-generated method stub
		return db.persons;
	}

}
