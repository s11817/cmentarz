package repositories;
import java.util.*;
import Domain.*;

public interface IPersonRepository extends IRepository<Person> {
	
	
	
	public Person ofPerson(Person person);
	public Person ofPerson(int personId);
	
	
	

	

}
