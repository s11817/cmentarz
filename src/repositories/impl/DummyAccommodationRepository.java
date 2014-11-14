package repositories.impl;

import java.util.List;

import Domain.Accommodation;
import repositories.IRepository;

public class DummyAccommodationRepository implements IRepository<Accommodation> {

	
	private DummyDb db;
	
	
	public DummyAccommodationRepository(DummyDb db){
		super();
		this.db = db;
		
		
	}
	
	
	public void add(Accommodation entity) {
		db.accommodations.add(entity);
		
	}

	public void update(Accommodation entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Accommodation entity) {
		db.accommodations.remove(entity);
		
	}

	public Accommodation get(int id) {
		for(Accommodation a : db.accommodations)
		{
			if(a.getId()==id)
				return a;
		}
		return null;
	}

	public List<Accommodation> getAll() {
		// TODO Auto-generated method stub
		return db.accommodations;
	}

	
	
	
	
	
}
