package repositories;
import java.util.*;
import Domain.*;

public interface IGuardianRepository extends IRepository<GuardianOfTheTomb> {
	
	
	
	//public Person ofPerson(Person person);
	//public Person ofPerson(int personId);
	public GuardianOfTheTomb ofGuardianOfTheTomb(GuardianOfTheTomb guardianOfTheTomb);
	public GuardianOfTheTomb ofGuardianOfTheTomb(int guardianOfTheTombId);
	//public Accommodation ofAccommodation(Accommodation accommodation);
	//public Accommodation ofAccommodation(int accommodationId);
	
	

	

}
