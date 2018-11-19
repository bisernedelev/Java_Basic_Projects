package Gen;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample {

    public static void main(String[] args) {

        final String DBMS_CONN_STRING = "jdbc:mysql://127.0.0.1:3306/sakila";
        final String DBMS_USERNAME = "root";
        final String DBMS_PASSWORD = "18991948";

        try (Connection con = DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
                Statement statement = con.createStatement();
                ResultSet rs = statement.executeQuery(
                        "SELECT * FROM address "
                        + "JOIN city "
                        + "ON address.city_id = city.city_id "
                        + "LIMIT 5")) {

            while (rs.next()) {
                System.out.printf("%d;%s;%s;%s%n",
                        rs.getInt("address_id"),
                        rs.getString("address"),
                        rs.getString("district"),
                        rs.getString("city"));
            }

        } catch (SQLException ex) {

            // SQLException is actually a linked list of Exceptions
            while (ex != null) {
                System.out.println(ex.getSQLState());
                System.out.println(ex.getMessage());
                System.out.println(ex.getErrorCode());
                ex = ex.getNextException();
            }

        }
    }
}
