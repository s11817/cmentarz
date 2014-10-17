
import javax.swing.JOptionPane;
import java.util.List;
import java.util.jar.Attributes.Name;   //nieuzywane

import repositories.impl.DummyDb;
import repositories.impl.DummyRepositoryCatalog;



import Domain.*;
import repositories.*;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name = JOptionPane.showInputDialog("Podaj swoje imieee"); //male proby okienek
		//JOptionPane.showMessageDialog(null, "Dziï¿½ki " + name);
		//System.out.println("name to" + name);
		//int liczba = Integer.parseInt(name);
		//System.out.println("i mala zmiankasssss");


		
		Person osoba1 = new Person();
		osoba1.setId(1);
		osoba1.setName("Zbigniew");
		osoba1.setSurname("Droga");
		osoba1.setDateOfDeath(2003,12,2);
		
		Person osoba2 = new Person();
		osoba2.setId(2);
		osoba2.setName("Roman");
		osoba2.setSurname("Kidler");
		osoba2.setDateOfDeath(2002,2,25);
		
		
		
		GuardianOfTheTomb opiekun1 = new GuardianOfTheTomb();
		opiekun1.setId(1);
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
		catalog.getPersons().add(osoba2);
		catalog.getGuardianOfTheTomb().add(opiekun1);
		catalog.getAccommodation().add(a1);
	
		DummyDb db = new DummyDb();  //proba wyswietlenia listy
		
		db.persons.add(osoba1); //proba wyswietlenia listy
		db.persons.add(osoba2); //proba wyswietlenia listy
		
		
		System.out.println("Osoba nr "+catalog.getPersons().get(1).getId()+" "+catalog.getPersons().get(1).getName()+" bla bla bla");
		
		
		System.out.println("Opiekun nr "/*+ db.guardians  */+" "+ db.persons); //proba wyswietlenia listy, jak to zrobiæ?
		 for (Person p: catalog.getPersons().getAll()) { System.out.println (p.getName());}//proba wyswietlenia listy
		
		
		//dodanie na git i proba odbioru w eclipse

		
	}

}
