package repositories;

import Domain.Accommodation;


public interface IAccommodationRepository  extends IRepository<Accommodation> {
	
	

	public Accommodation ofAccommodation(Accommodation accommodation);
	public Accommodation ofAccommodation(int accommodationId);
	
		

}
