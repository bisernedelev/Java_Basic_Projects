/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlStorageImplementations;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import contracts.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import address.Address;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class sqlAddressStorage implements AddressStorage {

    final String DBMS_CONN_STRING = "jdbc:mysql://127.0.0.1:3306/person_characteristics";

    final String DBMS_USERNAME = "root";

    final String DBMS_PASSWORD = "18991948";

    public int IdAddress;

    @Override
    public Address getAddress(int IdAddress) throws DALException {

        Address address = null;

        String sql = "SELECT * FROM address"
                + " WHERE IdAddress = ? ";

        try (Connection con = (Connection) DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
                PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql)) {
            statement.setInt(1, IdAddress);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                String country = rs.getString("Country");
                String city = rs.getString("City");
                String municipality = rs.getString("Municipality");
                String postalCode = rs.getString("PostalCode");
                String street = rs.getString("Street");
                String number = rs.getString("Number");
                int floor = rs.getInt("Floor");
                int ApartmentNo = rs.getInt("ApNo");
                address = new Address(country, city, municipality, postalCode, street, number, floor, ApartmentNo);
            }

        } catch (SQLException ex) {
            while (ex != null) {

                System.out.println(ex.getSQLState());

                System.out.println(ex.getMessage());

                System.out.println(ex.getErrorCode());

                ex = ex.getNextException();

            }
        }
        return address;
    }

    @Override
    public int insertAddress(Address address) throws DALException {
        try (Connection con = (Connection) DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
                //                CallableStatement statement = (CallableStatement) con.prepareCall("INSERT INTO address (Country,City,Municipality,PostalCode,Street,Number,Floor,ApNo,IdAddress)"
                //                   + "VALUES (?, ?, ?, ?, ?, ?,?,?,?)")) {
                CallableStatement statement = (CallableStatement) con.prepareCall("INSERT INTO address (Country,City,Municipality,PostalCode,Street,Number,Floor,ApNo)"
                        + "VALUES (?, ?, ?, ?, ?, ?,?,?)")) {

            statement.setString(1, address.getCountry());
            statement.setString(2, address.getCity());
            statement.setString(3, address.getMunicipality());
            statement.setString(4, address.getPostalCode());
            statement.setString(5, address.getStreet());
            statement.setString(6, address.getNumber());
            statement.setInt(7, address.getFloor());
            statement.setInt(8, address.getApartmentNo());
//            statement.setInt(9, address.IdAddress);

            statement.execute();

            try (ResultSet rs = con.createStatement().executeQuery("SELECT LAST_INSERT_ID();")) {
                rs.next();
                return rs.getInt(1);
            }

        } catch (SQLException ex) {
            DALException e = new DALException();
            e.addSuppressed(ex);
            throw e;
        }

    }

    public void clearDB() throws DALException {
        try (java.sql.Connection conn = DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);) {
            Statement statement = conn.createStatement();
            statement.execute("SET FOREIGN_KEY_CHECKS = 0;");
            statement.execute("TRUNCATE TABLE address;");
            statement.execute("SET FOREIGN_KEY_CHECKS = 1;");
            statement.close();
            conn.close();
        } catch (SQLException e) {
            while (e != null) {

                System.out.println(e.getSQLState());

                System.out.println(e.getMessage());

                System.out.println(e.getErrorCode());

                e = e.getNextException();

            }
        }
    }

}
