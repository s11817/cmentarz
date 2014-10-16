package repositories;

import Domain.Accommodation;


public interface IAccommodationRepository  extends IRepository<Accommodation> {
	
	
	
	//public Person ofPerson(Person person);
	//public Person ofPerson(int personId);
	//public GuardianOfTheTomb ofGuardianOfTheTomb(GuardianOfTheTomb guardianOfTheTomb);
	//public GuardianOfTheTomb ofGuardianOfTheTomb(int guardianOfTheTombId);
	public Accommodation ofAccommodation(Accommodation accommodation);
	public Accommodation ofAccommodation(int accommodationId);
	
	

	

}
