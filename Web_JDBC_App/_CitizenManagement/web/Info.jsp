<%-- 
    Document   : userInfo
    Created on : 26.04.2017, 11:13:09
    Author     : biserPC
--%>
<%@page import="contracts.DALException"%>
<%@page import="address.*"%>
<%@page import = "java.sql.*"%>
<%Class.forName("com.mysql.jdbc.Driver");%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Information</title>
        <style> 
            input[type=text] {
                width: 100%;
                box-sizing: border-box;
                border: 2px solid #ccc;
                border-radius: 4px;
                font-size: 16px;
                background-color: white;
                background-image: url('searchicon.png');
                background-position: 10px 10px; 
                background-repeat: no-repeat;
                padding: 12px 20px 12px 40px;
            }
            table {
    border-collapse: collapse;
    }
    @import url(https://fonts.googleapis.com/css?family=Open+Sans);


.area {
  text-align: center;
  font-size: 2.5em;
  color: #808080;
  letter-spacing: -3px;
  font-weight: 700;
  text-transform: uppercase;
  animation: blur .75s ease-out infinite;
  text-shadow: 0px 0px 5px #fff, 0px 0px 7px #fff;
}

@keyframes blur {
  from {
    text-shadow:0px 0px 10px #fff,
      0px 0px 10px #fff, 
      0px 0px 25px #fff,
      0px 0px 25px #fff,
      0px 0px 25px #fff,
      0px 0px 25px #fff,
      0px 0px 25px #fff,
      0px 0px 25px #fff,
      0px 0px 50px #fff,
      0px 0px 50px #fff,
      0px 0px 50px #7B96B8,
      0px 0px 150px #7B96B8,
      0px 10px 100px #7B96B8,
      0px 10px 100px #7B96B8,
      0px 10px 100px #7B96B8,
      0px 10px 100px #7B96B8,
      0px -10px 100px #7B96B8,
      0px -10px 100px #7B96B8;
  }
}
.button {
    background-color: #4CAF50; /* Green */
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
        <hr/>
        <form name="myForm" action="index.jsp" method="POST">
            <table >               
                <tbody>
                    <tr>
                        <td class="area">Insert ID (1-20): </td>
                        <td><input type="text" name="id" placeholder="Search.."></td>                       
                    </tr>
                </tbody>
            </table>
            <input class="button" type="submit" value="Submit" name="submit" style="border-radius: 9px;"/>
             
        </form>
         
        <a href="seeAll.jsp">SEE ALL !!!</a>



        <br/>
    </body>
</html>