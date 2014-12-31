package repositories.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Domain.*;
import repositories.*;
import unitofwork.IUnitOfWork;

public class AccommodationRepository extends Repository<Accommodation> {
public AccommodationRepository(Connection connection, IEntityBuilder<Accommodation> builder, IUnitOfWork uow) {
super(connection,builder,uow);
}
@Override
protected String getInsertQuery() {
return "INSERT INTO users(login,password) VALUES(?,?)";
}
@Override
protected String getUpdateQuery() {
return "UPDATE users SET (login,password)=(?,?) WHERE id=?";
}
@Override
protected String getTableName() {
return "users";
}
@Override
protected void setUpInsertQuery(Accommodation entity) throws SQLException {
insert.setInt(1, entity.getNrOfGrave());
insert.setLong(2, entity.getSector());
}
@Override
protected void setUpUpdateQuery(Accommodation entity) throws SQLException {
update.setInt(1, entity.getNrOfGrave());
update.setLong(2, entity.getSector());
update.setInt(3, entity.getId());
}
}
