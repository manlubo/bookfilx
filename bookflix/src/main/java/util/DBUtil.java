package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mariadb://np.gitbaby.com:3306/bookstore", "book", "1234");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
