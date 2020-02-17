import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;

public class JdbcExample {

	public static void main(String[] args) throws SQLException {

		BasicDataSource dataSource = new BasicDataSource();
		
		dataSource.setUrl("jdbc:postgresql://localhost:5432/dvdstore");
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
			
			System.out.printf("%-30s %5d\n", title, releaseYear);
		}
		
		String firstName = "Nick";
		String lastName = "O'Malley";
		lastName = "Stallone";
		
		// Parameterized uses ? as placeholders for dynamic parameters
		String sqlMoviesByActor = "SELECT film.title "
				+ "FROM film JOIN film_actor ON film.film_id = film_actor.film_id "
				+ "JOIN actor ON actor.actor_id = film_actor.actor_id "
				+ "WHERE actor.first_name = '" + firstName.toUpperCase() + "' "
				+ "AND actor.last_name = '" + lastName.toUpperCase() + "' ";
		
		results = stmt.executeQuery(sqlMoviesByActor);
		System.out.println("Films Starring: " + firstName + " " + lastName);
		
		while(results.next()) {
			String title = results.getString("title");
			
			
			System.out.printf("%-30s\n", title);
		}
		
		String sqlMoviesByActorParameterized = "SELECT film.title "
				+ "FROM film JOIN film_actor ON film.film_id = film_actor.film_id "
				+ "JOIN actor ON actor.actor_id = film_actor.actor_id "
				+ "WHERE actor.first_name = ? "
				+ "AND actor.last_name = ? ";
		
		PreparedStatement movieByActorStmt = conn1.prepareStatement(sqlMoviesByActorParameterized);
		movieByActorStmt.setString(1, firstName.toUpperCase());
		movieByActorStmt.setString(2, lastName.toUpperCase());
		
		results = movieByActorStmt.executeQuery();
		
		System.out.println("\n\n Again: ");
		while(results.next()) {
			String title = results.getString("title");
			
			
			System.out.printf("%-30s\n", title);
		}
	}

}
