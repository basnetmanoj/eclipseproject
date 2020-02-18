<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Employee</title>
</head>
<body>
<div class="container">
<form action="">
<fieldset>
<legend>Employee Management</legend>

<div class="form-group">
<label>Employee Name</label>
<input type="text" name="empName" class="form-control">
</div>

<div>
<label>Dob</label>\
<input type="date" name="dob">
</div>

<div>
<label>Hired Date</label>
<input type="date" name="hireddate">
</div>

<div>
<label>Address</label>
<input type="text" name="address">
</div>

<div>
<label>Department</label>
<input type="text" name="department" value="HR">
<input type="text" name="department" value="Finance">
</div>
</fieldset>
</form>

</div>
</body>
</html>