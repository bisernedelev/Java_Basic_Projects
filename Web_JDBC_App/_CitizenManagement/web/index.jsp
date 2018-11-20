<%-- 
    Document   : index
    Created on : 25.04.2017, 20:16:20
    Author     : biserPC
--%>
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
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Information</title>
        <style>
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    padding: 8px;
    text-align: left;
    
}

tr:hover{background-color:#f5f5f5}
.area {
  text-align: center;
  font-size: 1em;
  color: #808080;
  letter-spacing: -1px;
  font-weight: 700;
  text-transform: uppercase;
  animation: blur .75s ease-out infinite;
  text-shadow: 0px 0px 5px #fff, 0px 0px 7px #fff;
}
.area2 {
  text-align: center;
  font-size: 1em;
  color: #000000;
  letter-spacing: -1px;
  font-weight: 700;
  text-transform: uppercase;
  animation: blur .75s ease-out infinite;
  text-shadow: 0px 0px 5px #fff, 0px 0px 7px #fff;
}
.button {
    background-color: #FF0000; /* Green */
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 13px;
    margin: 4px 2px;
    cursor: pointer;
}
</style>
    </head>
    <body>
        <a href="Info.jsp"><input class="button" type="button" value="Home Page" name="home" style="border-radius: 2px;"/></a>

       
        <%  
            //START THROUGH !! - http://localhost:8081/00_CitizenManagement/index.jsp?id=1
            int id = Integer.parseInt(request.getParameter("id"));
            
             sqlPersonalStorage sqlPerson = new sqlPersonalStorage();
            Person person = null;
            try {
              
                   person = sqlPerson.getPerson(id);   
                  
                
            } catch (DALException ex) {
                System.out.print("Error2");
            }
         
                     Address adres = person.getAddress();
                
           
            
        %>
         <%  
          /*  //START THROUGH !! - http://localhost:8081/00_CitizenManagement/index.jsp?id=1
            int id2 = Integer.parseInt(request.getParameter("id2"));
            
             sqlPersonalStorage sqlPerson2 = new sqlPersonalStorage();
            Person person2 = null;
            try {
              
                   person2 = sqlPerson.getPerson(id2);   
                  
                
            } catch (DALException ex) {
                System.out.print("Error2");
            }
         
                     Address adres2 = person2.getAddress();
                
           */
            
            
        %>
<%         /*
            //START THROUGH !! - http://localhost:8081/00_CitizenManagement/index.jsp?id=1
            int id3 = Integer.parseInt(request.getParameter("id3"));
            
             sqlPersonalStorage sqlPerson3 = new sqlPersonalStorage();
            Person person3 = null;
            try {
              
                   person3 = sqlPerson.getPerson(id3);   
                  
                
            } catch (DALException ex) {
                System.out.print("Error2");
            }
         
                     Address adres3 = person3.getAddress();
                
           */
            
        %>
     
        <table>       
            <tbody>
                <tr>
                    <td class="area">First Name</td>
                    <td class="area">Middle Name</td>
                    <td class="area">Last Name</td>
                    <td class="area">Gender</td>
                    <td class="area">Height</td>
                    <td class="area">Date of birth</td>
                    <td class="area">Country</td>
                    <td class="area">City</td>
                    <td class="area">Municipality</td>
                    <td class="area">Postalcode</td>
                    <td class="area">Street</td>
                    <td class="area">Number</td>
                    <td class="area">Floor</td>
                    <td class="area">Apartment</td>
                </tr>
                <tr>
                    <td class="area2"><%= person.getFirstName()%></td>
                    <td class="area2"><%= person.getMiddleName()%></td>
                    <td class="area2"><%= person.getLastName()%></td>
                    <td class="area2"><%= person.getGender()%></td>
                    <td class="area2"><%= person.getHeight()%></td>
                    <td class="area2"><%= person.getAge()%></td>
                    <td class="area2"><%= adres.getCountry()%></td>
                    <td class="area2"><%= adres.getCity()%></td>
                    <td class="area2"><%= adres.getMunicipality()%></td>
                    <td class="area2"><%= adres.getPostalCode()%></td>
                    <td class="area2"><%= adres.getStreet()%></td>
                    <td class="area2"><%= adres.getNumber()%></td>
                    <%if (adres.getFloor()!= 0.0) {%>
                    <td class="area2"><%= adres.getFloor()%></td>
                    <%} else {%>
                    <td><%%></td>
                    <%}%>
                    <%if (adres.getApartmentNo() != 0.0) {%>
                    <td class="area2"><%= adres.getApartmentNo()%></td>
                    <%} else {%>
                    <td><%%></td>
                    <%}%></tr> 
                
                  
            </tbody>
        </table>
      
        <br/>
      
    </body>
</html>