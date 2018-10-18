<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
 
<body background="images/9.jpg" height=500% width=500%>
<jsp:include page="header.jsp"/>

     
<div id="main-wrapper">
<center><h1><u>Login Here!!</u></h1>
  
  </center>
  
    <form name="login" action="LoginServlet" method="post" onsubmit="return validate()">
       
        
        
            <center><label><b>E-mail<sup><font color="#FF0000">*</font></sup> :</b></label>  
           <em>
          <input type="email" name="email" id="span1" class="inputvalues" placeholder="E-mail"/><span id="ucorrect1" style="color:#090;"></span><br><span id="uname" style="color:#F00;"></span>
          </em> <span id="uname" style="color:#F00;"></span>
          <br>
         
         
            <label><b>Password<sup><font color="#FF0000">*</font></sup> :</b></label>  
           <em>
          <input type="password" name="password" id="span2" class="inputvalues" placeholder="password"><span id="ucorrect2" style="color:#090;"></span><br>
          </em> <span id="upass" style="color:#F00;"></span>
          <br> <br>
         
           
          <input type="submit" value="SignIn"  id="login_btn"/>  <br> <br> <hr>
           
        <p><b>Create your account :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         <a href="registration.jsp"><input type="button" value="Create a New Account" id="back_btn"/> </a></b></p> 
         </center> <br> <br> <br>
         <jsp:include page="footer.jsp" />
 </form>
</body>
</html>