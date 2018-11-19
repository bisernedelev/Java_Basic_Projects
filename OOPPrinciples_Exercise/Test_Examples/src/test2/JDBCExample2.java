package test2;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class JDBCExample2 {

    public static void main(String[] args) {

        final String DBMS_CONN_STRING = "jdbc:mysql://127.0.0.1:3306/sakila";
        final String DBMS_USERNAME = "root";
        final String DBMS_PASSWORD = "18991948";

        try (Connection con = DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
                CallableStatement statement = con.prepareCall("{call film_in_stock(?, ?, ?)}")) {

            statement.setInt("p_film_id", 1);
            statement.setInt("p_store_id", 1);
            statement.registerOutParameter("p_film_count", Types.INTEGER);

            statement.executeQuery();
            System.out.println(statement.getInt("p_film_count"));

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
