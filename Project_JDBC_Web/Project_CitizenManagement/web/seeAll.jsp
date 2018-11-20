<%-- 
    Document   : seeAll
    Created on : 28.06.2017, 11:43:57
    Author     : biserPC
--%>

<%@page import="sqlStorageImplementations.sqlGetAllPersons"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@page import="sqlStorageImplementations.sqlPersonalStorage"%>
        <%@page import="sqlStorageImplementations.sqlAddressStorage"%>
        <%@page import="java.time.LocalDateTime"%>
        <%@page import="insurance.SocialInsuranceRecord"%>
        <%@page import="java.util.LinkedList"%>
        <%@page import="education.Education"%>
        <%@page import="personaldetails.*"%>
        <%@page import="java.util.logging.Logger"%>
        <%@page import="java.util.logging.Level"%>
        <%@page import="contracts.*"%>
        <%@page import="address.Address"%>
        <%@page import="personaldetails.Person"%>
        <%@page import = "java.sql.*"%>
        <%Class.forName("com.mysql.jdbc.Driver");%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>



        <%
            Person person = null;
            for (int id = 1; id < 15; id++) {
                
                sqlGetAllPersons getAll = new sqlGetAllPersons();

                try {

                    person = getAll.getPerson(id);

                } catch (DALException ex) {
                    System.out.print("Error2");
                }
            }

            Address adres = person.getAddress();


        %>


        <table border="1">       
            <tbody>
                <tr>
                    <td>First Name</td>
                    <td>Middle Name</td>
                    <td>Last Name</td>
                    <td>gender</td>
                    <td>Height</td>
                    <td>Date of birth</td>
                    <td>Country</td>
                    <td>City</td>
                    <td>municipality</td>
                    <td>postalcode</td>
                    <td>street</td>
                    <td>number</td>
                    <td>floor</td>
                    <td>apartment</td>

                </tr>
                <tr>
                    <td><%= person.getFirstName()%></td>
                    <td><%= person.getMiddleName()%></td>
                    <td><%= person.getLastName()%></td>
                    <td><%= person.getGender()%></td>
                    <td><%= person.getHeight()%></td>
                    <td><%= person.getAge()%></td>
                    <td><%= adres.getCountry()%></td>
                    <td><%= adres.getCity()%></td>
                    <td><%= adres.getMunicipality()%></td>
                    <td><%= adres.getPostalCode()%></td>
                    <td><%= adres.getStreet()%></td>
                    <td><%= adres.getNumber()%></td>
                    <%if (adres.getFloor() != 0.0) {%>
                    <td><%= adres.getFloor()%></td>
                    <%} else {%>
                    <td><%%></td>
                    <%}%>
                    <%if (adres.getApartmentNo() != 0.0) {%>
                    <td><%= adres.getApartmentNo()%></td>
                    <%} else {%>
                    <td><%%></td>
                    <%}%>
                </tr>
            </tbody>
        </table>
        <br/>      

    </body>
</html>
