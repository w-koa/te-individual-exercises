import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;

public class JdbcExample {

	public static void main(String[] args) throws SQLException {

		BasicDataSource dataSource = new BasicDataSource();
		
		dataSource.setUrl("jdbc:postgress://localhost:5432//dvdstore");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		Connection conn1 = dataSource.getConnection();
		
		Statement stmt = conn1.createStatement();
		
		String sqlActionFilmsReleased2006 = "SELECT film.title, film.release_year " +
				"FROM film JOIN film_category ON film.film_id = film_category.film_id " +
				"JOIN category ON category.category_id = film_category.category_id "
				+ "WHERE film.release_year = 2006 AND category.name = 'Action' ";

		ResultSet results = stmt.executeQuery(sqlActionFilmsReleased2006);
		while(results.next()) {
			String title = results.getString("title"); // Name of column in db
			int releaseYear = results.getInt("release_year");
			
			System.out.printf("%-30s %5d", title, releaseYear);
		}
		
	}

}
