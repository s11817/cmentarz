
import javax.swing.JOptionPane;

import repositories.impl.DummyDb;

import java.util.List;
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
		
		
		
		IRepositoryCatalog catalog = new DummyRepositoryCatalog();
		List<User> admins = catalog.getUsers().withRole("administrator");
		catalog.getUsers().add(new User());
		
		
		System.out.println("i jeszcze raz w drug�strone");
		
	}

}
