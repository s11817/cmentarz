
import javax.swing.JOptionPane;

import java.util.List;
import java.util.jar.Attributes.Name;   //nieuzywane

import repositories.impl.DummyDb;
import repositories.impl.DummyRepositoryCatalog;



import Domain.*;
import repositories.*;
import repositories.impl.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		//Connection connection = null;
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/cmentarz","user1","user1");
			System.out.println("Connection OK");
		
			String query = "SELECT * FROM person";
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()){
				System.out.println("Name :"+rs.getString("name"));
			}
		
		
		} catch (Exception e) {
			System.err.println(e);
		}
		
		
		

		System.out.println("Koniec");
		
	}	
	}