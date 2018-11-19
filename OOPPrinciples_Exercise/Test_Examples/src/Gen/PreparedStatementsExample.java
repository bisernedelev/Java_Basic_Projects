
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementsExample {

    static final String DBMS_CONN_STRING = "jdbc:mysql://127.0.0.1:3306/sakila";
    static final String DBMS_USERNAME = "root";
    static final String DBMS_PASSWORD = "18991948";

    public static void main(String[] args) {

        String sqlStatement = "SELECT * FROM address "
                + "JOIN city "
                + "ON address.city_id = city.city_id "
                + "JOIN country "
                + "ON city.country_id = country.country_id "
                + "WHERE country.country = ? "
                + "LIMIT 5";

        try (Connection con = DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
                PreparedStatement statement = con.prepareStatement(sqlStatement)) {

            System.out.println(executePreparedStatement(statement, "United States"));
            System.out.println(executePreparedStatement(statement, "Austria"));
            System.out.println(executePreparedStatement(statement, "Italy"));

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

    private static String executePreparedStatement(PreparedStatement statement, String arg) throws SQLException {

        StringBuilder result = new StringBuilder();

        statement.setString(1, arg);

        try (ResultSet rs = statement.executeQuery()) {
            while (rs.next()) {
                result.append(String.format("%d - %s, %s, %s%n", rs.getInt("address_id"),
                        rs.getString("address"), rs.getString("city"), rs.getString("district")));
            }
        }

        return result.toString();
    }
}
