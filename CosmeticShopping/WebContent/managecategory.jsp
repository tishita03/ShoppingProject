<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manage Category</title>

</head>
<body>
<center>
<form action="CategoryServlet" method="post">

<div style="border: 2px solid; width: 60%; margin-top: 15%;  background-color: #ff00bf">
<form action="">

<table>
<h1  style="margin-bottom: 5%">Add Category</h1>
<tr>
<td><b>Category Name:-</b></td>
<td><input type="text" name="name"/></td>
</tr>
<tr style="margin: 10%">
<td><b>Category Description:-</b></td>
<td><textarea cols="22" row="4" name="description"></textarea></td>
</tr>
</table>



<input type="submit" value="Submit"/>
</div>


</form>
</center>

</body>
</html>