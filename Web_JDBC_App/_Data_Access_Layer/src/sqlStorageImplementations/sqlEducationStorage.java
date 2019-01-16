/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlStorageImplementations;

import contracts.DALException;
import contracts.EducationStorage;
import education.*;

import java.sql.*;
import java.time.LocalDate;
import java.util.LinkedList;

/**
 *
 * @author biserPC
 */
public class sqlEducationStorage implements EducationStorage {

    final String DBMS_CONN_STRING = "jdbc:mysql://127.0.0.1:3306/person_characteristics";

    final String DBMS_USERNAME = "root";

    final String DBMS_PASSWORD = "18991948";

    public int idDegree;

//    @Override
    public void insertDegree(String degree) throws DALException {
        String sql = "INSERT INTO education(typeDegree)VALUE(?)";

        try (Connection con = DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
                CallableStatement statement = con.prepareCall(sql)) {
       
            if (degree.equalsIgnoreCase("p")) {
                statement.setString(1, "Primary");
            } else if (degree.equalsIgnoreCase("s")) {
                statement.setString(1, "Secondary");
            } else if (degree.equalsIgnoreCase("b")) {
                statement.setString(1, "Bachelor");
            } else if (degree.equalsIgnoreCase("m")) {
                statement.setString(1, "Master");
            } else if (degree.equalsIgnoreCase("d")) {
                statement.setString(1, "Doctorate");
            }
          
            boolean results = statement.execute();
            while (results) {
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
    public void insertEducation(Education education, int idPerson) throws DALException {
        String sql = "INSERT INTO education (EnrollmentDate,GraduationDate,isGraduated,InstitutionName,finalGrade)"
                   + "VALUES (?, ?, ?, ?, ?)";
        try (Connection con = DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
                CallableStatement statement = con.prepareCall(sql)) {

            java.sql.Date date = java.sql.Date.valueOf(education.getEnrollmentDate());
            statement.setDate(1, date);
            java.sql.Date dateGrad = java.sql.Date.valueOf(education.getGraduationDate());
            statement.setDate(2, dateGrad);
            statement.setBoolean(3, education.isGraduated());
            statement.setString(4, education.getInstitutionName());
            statement.setDouble(5, 0.0);
       

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

//    @Override
    public void insertGradedEducation(GradedEducation gradedEducation, int idPerson) throws DALException {

        String sql = "CALL insertGradedEducation(?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
                CallableStatement statement = con.prepareCall(sql)) {
            java.sql.Date date = java.sql.Date.valueOf(gradedEducation.getEnrollmentDate());
            statement.setDate(1, date);
            java.sql.Date dateGrad = java.sql.Date.valueOf(gradedEducation.getGraduationDate());
            statement.setDate(2, dateGrad);
            statement.setBoolean(3, gradedEducation.isGraduated());
            statement.setString(4, gradedEducation.getInstitutionName());
            if (!gradedEducation.getGraduationDate().isAfter(LocalDate.now())) {
                statement.setDouble(5, gradedEducation.getFinalGrade());
            } else {
                statement.setDouble(5, 0);
            }
            statement.setInt(6, idPerson);
        //    statement.setInt(7, insertDegree(String degree));
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

//    @Override
    public LinkedList<Education> getEducation(int id) throws DALException {

        Education education = null;
        LinkedList<Education> listEducation = new LinkedList<Education>();
        String sql = "SELECT EnrollmentDate,GraduationDate,isGraduated,InstitutionName,finalGrade,idPerson,idDegree  FROM education WHERE educationdegree."
                + "IdEducationDegree = ?";

        try (Connection con = DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
                PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, id);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Date enrollmentDate = rs.getDate("EnrollmentDate");
                LocalDate enroll = enrollmentDate.toLocalDate();
                Date graduationDate = rs.getDate("GraduationDate");
                LocalDate graduation = graduationDate.toLocalDate();
                boolean isGraduated = rs.getBoolean("isGraduated");
                String institutionName = rs.getString("InstitutionName");
                float finalGrade = rs.getFloat("finalGrade");
                int idPerson = rs.getInt("idPerson");
                int idDegree = rs.getInt("idDegree");

                education = new Education(institutionName, enroll, graduation, idDegree, idPerson, finalGrade) {

                    @Override
                    public String getDegree(int idDegree) {

                        String degree = "";
                        String sqlStatement = "SELECT TypeDegree FROM educationdegree WHERE IdEducationDegree = ?;";

                        try (Connection con = DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
                                PreparedStatement statement = con.prepareStatement(sqlStatement)) {
                            statement.setInt(1, id);

                            ResultSet rs = statement.executeQuery();

                            while (rs.next()) {
                                degree = rs.getString("degree");
                            }
                        } catch (SQLException ex) {

                            while (ex != null) {

                                System.out.println(ex.getSQLState());

                                System.out.println(ex.getMessage());

                                System.out.println(ex.getErrorCode());

                                ex = ex.getNextException();
                            }
                        }
                        return degree;
                    }
                };
                listEducation.add(education);
            }

        } catch (SQLException ex) {

            while (ex != null) {

                System.out.println(ex.getSQLState());

                System.out.println(ex.getMessage());

                System.out.println(ex.getErrorCode());

                ex = ex.getNextException();
            }
        }
        return listEducation;

    }

    public void clearDB() throws DALException {
        try (Connection conn = DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);) {
            Statement statement = conn.createStatement();
            statement.execute("SET FOREIGN_KEY_CHECKS = 0;");
            statement.execute("TRUNCATE TABLE education;");
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
