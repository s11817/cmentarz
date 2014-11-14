package repositories.impl;

import java.util.Collection;
import java.util.List;

import Domain.GuardianOfTheTomb;
import Domain.*;
import repositories.*;

public class DummyGuardianOfTheTombRepository implements IRepository<GuardianOfTheTomb> {
	
	private DummyDb db;
	
	
	public DummyGuardianOfTheTombRepository(DummyDb db) {
		super();
		this.db = db;
	}
	
	

	public void add(GuardianOfTheTomb entity) {
		db.guardians.add(entity);
		
	}

	public void update(GuardianOfTheTomb entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(GuardianOfTheTomb entity) {
		db.guardians.remove(entity);
		
	}

	public GuardianOfTheTomb get(int id) {
		for (GuardianOfTheTomb g : db.guardians)
		{
			if(g.getId()==id)
				return g;
		}
		return null;
	}

	public List<GuardianOfTheTomb> getAll() {
		// TODO Auto-generated method stub
		return db.guardians;
	}
	
	
	

}
