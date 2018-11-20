/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlStorageImplementations;

import contracts.DALException;
import contracts.SocialInsuranceStorage;
import insurance.SocialInsuranceRecord;
import java.sql.*;
import java.util.LinkedList;

/**
 *
 * @author biserPC
 */
public class sqlInsuranceStorage implements SocialInsuranceStorage {

    final String DBMS_CONN_STRING = "jdbc:mysql://127.0.0.1:3306/person_characteristics";

    final String DBMS_USERNAME = "root";

    final String DBMS_PASSWORD = "18991948";

    @Override
    public void insertSocialInsurance(SocialInsuranceRecord insurance, int idPerson) throws DALException {

        String sql = "CALL insertSocialInsurance(?, ?, ?, ?)";
        try (Connection con = DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
                CallableStatement statement = con.prepareCall(sql)) {
            statement.setInt(1, insurance.getYear());
            statement.setInt(2, insurance.getMonth());
            statement.setDouble(3, insurance.getAmount());
            statement.setInt(4, idPerson);
            statement.execute();

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
    public LinkedList<SocialInsuranceRecord> insurances(int id) throws DALException {
        SocialInsuranceRecord insurance = null;
        LinkedList<SocialInsuranceRecord> listInsurance = new LinkedList<SocialInsuranceRecord>();
        String sql = "SELECT year, month, amount FROM socialinsurance WHERE IdPerson = ?;";

        try (Connection con = DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
                PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, id);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                int year = rs.getInt("year");
                int month = rs.getInt("month");
                double amount = rs.getDouble("amount");
                insurance = new SocialInsuranceRecord(year, month, amount);
                listInsurance.add(insurance);
            }

        } catch (SQLException ex) {

            while (ex != null) {

                System.out.println(ex.getSQLState());

                System.out.println(ex.getMessage());

                System.out.println(ex.getErrorCode());

                ex = ex.getNextException();
            }
        }
        return listInsurance;
    }

    public void trancateTable() throws DALException {
        String sqlStatement = 
"TRUNCATE socialinsurance;\n" ;
        try (Connection con = DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
                CallableStatement statement = con.prepareCall(sqlStatement)) {
            statement.execute();
        } catch (SQLException ex) {

            while (ex != null) {

                System.out.println(ex.getSQLState());

                System.out.println(ex.getMessage());

                System.out.println(ex.getErrorCode());

                ex = ex.getNextException();

            }
        }
    }
}
