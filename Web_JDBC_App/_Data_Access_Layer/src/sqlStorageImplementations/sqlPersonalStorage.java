/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlStorageImplementations;

import contracts.DALException;
import contracts.PersonStorage;
import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Logger;
import personaldetails.*;

/**
 *
 * @author biserPC
 */
public class sqlPersonalStorage implements PersonStorage {

    final String DBMS_CONN_STRING = "jdbc:mysql://127.0.0.1:3306/person_characteristics";

    final String DBMS_USERNAME = "root";

    final String DBMS_PASSWORD = "18991948";

    @Override
    public void insertPerson(Person person, int addressId) throws DALException {
        String sql = "INSERT INTO person (FirstName,MiddleName,LastName,GenderId,Height,BirthDate,IdAddress)"
                + "VALUES (?, ?, ?, ?, ?, ?,?)";

        try (Connection con = DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
                CallableStatement statement = con.prepareCall(sql)) {

            statement.setString(1, person.getFirstName());
            statement.setString(2, person.getMiddleName());
            statement.setString(3, person.getLastName());

            if (person.getGender() == Gender.Male) {
                statement.setString(4, "M");
            } else {
                statement.setString(4, "F");
            }
            statement.setInt(5, person.getHeight());
            java.sql.Date date = java.sql.Date.valueOf(person.getDateOfBirth());
            statement.setDate(6, date);
            statement.setInt(7, addressId);

            boolean hadResults = statement.execute();
            while (hadResults) {
                ResultSet rs = statement.executeQuery();

            }

        } catch (SQLException ex) {

            while (ex != null) {

                System.out.println(ex.getSQLState());

                System.out.println(ex.getMessage());

                System.out.println(ex.getErrorCode());

                ex = ex.getNextException();

            }
        }

    }

    @Override
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

    public void clearDB() throws DALException {
        try (Connection conn = DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);) {
            Statement statement = conn.createStatement();
            statement.execute("SET FOREIGN_KEY_CHECKS = 0;");
            statement.execute("TRUNCATE TABLE person;");
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
