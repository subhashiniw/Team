
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
 
import javax.sql.DataSource;
 
public class DbUtil {
 
private DataSource dataSource;
 
public DataSource getDataSource() {
	return dataSource;
}
 
public void setDataSource(DataSource dataSource) {
	this.dataSource = dataSource;
}
 
public void initialize(){
	DataSource dataSource = getDataSource();
	try {
		Connection connection = dataSource.getConnection();
		Statement statement = connection.createStatement();
		statement.executeUpdate("IF OBJECT_ID('PLAYER') IS NULL CREATE TABLE PLAYER (ID VARCHAR(20) PRIMARY KEY, TEAM_ID VARCHAR(20) ,NAME VARCHAR(150), DOB datetime, AGE INT)");
		statement.executeUpdate("IF OBJECT_ID('TEAM') IS NULL CREATE TABLE TEAM (ID VARCHAR(20), NAME VARCHAR(150))");
		statement.executeUpdate("DELETE FROM TEAM");
		statement.executeUpdate("DELETE FROM TEAM");
		statement.close();
		connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}