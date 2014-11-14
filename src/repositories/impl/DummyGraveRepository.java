package repositories.impl;

import java.util.List;

import Domain.Accommodation;
import Domain.Grave;
import repositories.IRepository;

public class DummyGraveRepository implements IRepository<Grave> {

	private DummyDb db;
	
	
	public DummyGraveRepository(DummyDb db){
		super();
		this.db = db;
	}

	public void add(Grave entity) {


		db.graves.add(entity);
		
	}

	public void update(Grave entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Grave entity) {
		db.graves.remove(entity);
		
	}

	public Grave get(int id) {
		for(Grave a : db.graves)
		{
			if(a.getId()==id)
				return a;
		}
		return null;
	}

	public List<Grave> getAll() {
		// TODO Auto-generated method stub
		return db.graves;
	}
	
	
	
}


