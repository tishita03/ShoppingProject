<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body background="images/9.jpg" height="500%" width="500%">
<jsp:include page="header.jsp"/>
<form action="SignupServlet" method="post" name="Signup"> 
<h1> <center> <u> Register as New User</u></center></h1>
<table align="center" cellpadding=3 width="10%">
<tr> <td><h3>Name:</h3></td><td> <input type="text" name="uname" value="First Name..." onclick="this.value=''"/></tr></td>
<tr> <td><h3>Password:</h3> </td><td><input type="password" name="upass"  " onclick="this.value=''"/></td></tr>
<tr> <td><h3>Contact:</h3></td><td> <input type="number" name="contact" value="Mobile Number..." onclick="this.value=''"/></td></tr>
<tr> <td><h3>Email:</h3> </td><td><input type="text" name="uemail"  value="Email ID..." onclick="this.value=''"/></td></tr> 
<tr> <td><h3>Gender:</h3> </td> <td> <input type="radio" name="rb"  value="" onclick="this.value=''"/> <b> MALE </b> </tr></td>
<tr> <td> </td> <td> <input type="radio" name="rb"  value="" onclick="this.value=''"/> <b>FEMALE</b> </tr></td>

 

 <tr> <td><br> <br> <input type="submit" value="REGISTER NOW"/> </td></tr><br> <br> <br> </table> </form> <br> <br> 

 
<jsp:include page="footer.jsp" />



  
</body>
</html>