package repositories;
import java.util.*;
import Domain.*;

public interface IGraveRepository extends IRepository<Grave> {
	
	public Grave ofGrave(Grave grave);
	public Grave ofGrave(int grave);
	

}






