package nexus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws SQLException {

		Connection conn1 = null;
		String dbURL1 = "jdbc:oracle:thin:tiger/scott@localhost:1521:productD8";
		try {
			conn1 = DriverManager.getConnection(dbURL1);
		} catch (Exception e) {
			LOG.trace(e.getMessage());
		} finally {
			conn1.close();
			if (conn1 != null) {
				LOG.trace("Connected with connection #1");
			}
		}
	}
}
