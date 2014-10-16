package repositories;
import java.util.*;
import Domain.*;

public interface IGuardianRepository extends IRepository<GuardianOfTheTomb> {
	
	
	
	public GuardianOfTheTomb ofGuardianOfTheTomb(GuardianOfTheTomb guardianOfTheTomb);
	public GuardianOfTheTomb ofGuardianOfTheTomb(int guardianOfTheTombId);
	

}
