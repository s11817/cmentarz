
import javax.swing.JOptionPane;

import repositories.impl.DummyDb;
import repositories.impl.DummyRepositoryCatalog;

import java.util.List;

import Domain.Accommodation;
import Domain.Fees;
import Domain.GuardianOfTheTomb;
import Domain.Person;
import repositories.*;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name = JOptionPane.showInputDialog("Podaj swoje imieee");
		//JOptionPane.showMessageDialog(null, "Dzi�ki " + name);
		//System.out.println("name to" + name);
		//int liczba = Integer.parseInt(name);
		//System.out.println("i mala zmiankasssss");
		
		
		
		//IRepositoryCatalog catalog = new DummyRepositoryCatalog();
		//catalog.getPersons().add(new Person());
		
		
		Person osoba1 = new Person();
		osoba1.setId(1);
		osoba1.setName("Zbigniew");
		osoba1.setSurname("Droga");
		osoba1.setDateOfDeath(2003,12,2);
		
		GuardianOfTheTomb opiekun1 = new GuardianOfTheTomb();
		opiekun1.setNameOfGuardian("Roza");
		opiekun1.setSurnameOfGuardian("Droga");
		opiekun1.setNrTelOfGuardian(500600800);
		opiekun1.setPerson(osoba1);
		
		Accommodation a1 = new Accommodation();
		a1.setPerson(osoba1);
		a1.setNrOfGrave(1);
		a1.setSector("A");
		a1.setSinceWhen(2003);
		a1.setForWhen(2015);
		
		IRepositoryCatalog catalog = new DummyRepositoryCatalog();
		catalog.getPersons().add(osoba1);
	

		
		
		
		System.out.println("Osoba nr "+catalog.getPersons().getPerson(osoba1)+" "+osoba1.getName());
		
		
		
		
		
		
		
		
		
		System.out.println("i jeszcze raz w drug�strone");
		
	}

}
