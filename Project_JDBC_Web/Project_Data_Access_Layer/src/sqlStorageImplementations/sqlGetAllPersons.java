/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlStorageImplementations;
 
import address.Address;
import contracts.DALException;
import contracts.PersonStorage;
import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Logger;
import personaldetails.*;

public class sqlGetAllPersons {
    
    final String DBMS_CONN_STRING = "jdbc:mysql://127.0.0.1:3306/person_characteristics";

    final String DBMS_USERNAME = "root";

    final String DBMS_PASSWORD = "18991948";
    
    
    
    public Person getPerson(int id) throws DALException {

        Person person = null;
        String sql = "SELECT FirstName, MiddleName, LastName, GenderId,Height, BirthDate, IdAddress "
                + "FROM person WHERE Id = ?;";

        try (Connection con = DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
                PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, id);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                String firstName = rs.getString("FirstName");
                String middleName = rs.getString("MiddleName");
                String last_name = rs.getString("LastName");
                Gender gender = null;
                if (rs.getString("GenderId").equalsIgnoreCase("m")) {
                    gender = Gender.Male;
                } else {
                    gender = Gender.Female;
                }
                int height = rs.getInt("Height");
                Date birthday = rs.getDate("BirthDate");
                LocalDate dateOfBirth = birthday.toLocalDate();

                person = new Person(firstName, middleName, last_name, gender, height, dateOfBirth);
                
                person.setAddress(new sqlAddressStorage().getAddress(rs.getInt("IdAddress")));
            }

        } catch (SQLException ex) {

            while (ex != null) {

                System.out.println(ex.getSQLState());

                System.out.println(ex.getMessage());

                System.out.println(ex.getErrorCode());

                ex = ex.getNextException();
            }
        }
        return person;
    }
    
     public Address getAddress(int IdAddress) throws DALException {

        Address address = null;

        String sql = "SELECT * FROM address";

        try (com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
                com.mysql.jdbc.PreparedStatement statement = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql)) {
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
    
    
    
    
}
