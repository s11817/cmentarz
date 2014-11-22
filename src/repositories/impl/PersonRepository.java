package repositories.impl;

import java.util.List;

import repositories.IRepository;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Domain.Person;



public class PersonRepository implements IRepository<Person> {
	
	
	private Connection connection;
	
	private String insertSql=
	"INSERT INTO person(name, surname, dateOfDeath) VALUES(?,?,?)";
	
	private String selectByIdSql=
	"SELECT * FROM person WHERE id=?";
	
	private String updateSql=
	"UPDATE users SET (dateOfDeath)=(?) WHERE id=?";
	
	private String deleteSql=
	"DELETE FROM person WHERE id=?";
	
	private String selectAllSql=
	"SELECT * FROM person";
	
	
	private PreparedStatement insert;
	private PreparedStatement selectById;
	private PreparedStatement update;
	private PreparedStatement selectAll;
	private PreparedStatement delete;
	
	

	public PersonRepository(Connection connection) {
this.connection = connection;
try
{
insert = connection.prepareStatement(insertSql);
selectById=connection.prepareStatement(selectByIdSql);
update=connection.prepareStatement(updateSql);
delete=connection.prepareStatement(deleteSql);
selectAll=connection.prepareStatement(selectAllSql);
} catch (Exception e) {
e.printStackTrace();
}
}
	
	
	
	
	

	public void add(Person entity) {

try {
insert.setString(1, entity.getName());
insert.setString(2, entity.getSurname());
insert.executeUpdate();
} catch (SQLException e) {
e.printStackTrace();
}
	}

	public void update(Person entity) {

try {
update.setString(1, entity.getName());
update.setString(2, entity.getSurname());
update.setInt(3, entity.getId());
update.executeUpdate();
} catch (SQLException e) {
e.printStackTrace();
}

	}

	public void delete(Person entity) {
		try {
			delete.setInt(1, entity.getId());
			delete.executeUpdate();
			} catch (SQLException e) {
			e.printStackTrace();
			}

	}

	public Person get(int id) {

try {
selectById.setInt(1, id);
ResultSet rs = selectById.executeQuery();
while(rs.next())
{
Person person = new Person();
person.setId(rs.getInt("id"));
person.setName(rs.getString("imie"));
person.setSurname(rs.getString("nazwisko"));
return person;
}
} catch (SQLException e) {
e.printStackTrace();
}
return null;
	}

	public List<Person> getAll() {

List<Person> result = new ArrayList<Person>();
try {
ResultSet rs = selectAll.executeQuery();
while(rs.next())
{
Person u = new Person();
u.setId(rs.getInt("id"));
u.setName(rs.getString("imie"));
u.setSurname(rs.getString("Nazwisko"));
result.add(u);
}
} catch (SQLException e) {
e.printStackTrace();
}
return result;
	}

}
