
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
				System.out.println("Imie i nazwisko :"+rs.getString("name")+" "+rs.getString("surName"));
			}
		
			
			String query2 = "SELECT * FROM accommodation";
			Statement stmt2 = connection.createStatement();
			ResultSet rs2 = stmt2.executeQuery(query2);
			
			while(rs2.next()){
				System.out.println("ID = "+rs2.getInt("id")+" nr grobu:"+rs2.getInt("nrOfGrave")+", sector "+rs2.getString("sector"));
			}
			
			
			//select na pokazanie dzia³ania relacji pomiêdzy tabelami
			String query3 = " SELECT * FROM person INNER JOIN accommodation ON(person.id = accommodation.idPerson)";
			Statement stmt3 = connection.createStatement();
			ResultSet rs3 = stmt3.executeQuery(query3);
			while(rs3.next()){
				System.out.println("Imie i nazwisko :"+rs3.getString("name")+" "+rs3.getString("surName")+"ID = "+rs3.getInt("id")+" nr grobu:"+rs3.getInt("nrOfGrave")+", sector "+rs3.getString("sector"));
			}	
			
		
		} catch (Exception e) {
			System.err.println(e);
		}
		
		
		

		System.out.println("Koniec");
		
	}	
	}