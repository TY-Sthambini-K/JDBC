<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<h1 style="color: blue">Employee Register Form</h1>
<form class="col-md-6" method="post" action="/users">
  <div class="form-group ">
    <label for="exampleInputEmail1">eid</label>
    <input type="number" class="form-control" id="eid" aria-describedby="eid" placeholder="Enter eid">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="name" placeholder="Enter name">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">email</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="email" placeholder="Enter email">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">mobile</label>
    <input type="number" class="form-control" id="mobile" aria-describedby="mobile" placeholder="Enter number">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">designation</label>
    <input type="text" class="form-control" id="designation" aria-describedby="designation" placeholder="Enter designation">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">doj</label>
    <input type="date" class="form-control" id="doj" aria-describedby="doj" placeholder="Enter doj">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">salary</label>
    <input type="number" class="form-control" id="salary" aria-describedby="salary" placeholder="Enter salary">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">dob</label>
    <input type="date" class="form-control" id="dob" aria-describedby="dob" placeholder="Enter dob">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">bloodgroup</label>
    <input type="text" class="form-control" id="bloodgroup" aria-describedby="bloodgroup" placeholder="Enter bloodgroup">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">age</label>
    <input type="number" class="form-control" id="age" aria-describedby="age" placeholder="Enter age">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">deptid</label>
    <input type="number" class="form-control" id="deptid" aria-describedby="deptid" placeholder="Enter deptid">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">govtid</label>
    <input type="text" class="form-control" id="govtid" aria-describedby="govtid" placeholder="Enter govtid">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">gender</label>
    <input type="text" class="form-control" id="gender" aria-describedby="gender" placeholder="Enter gender">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">status</label>
    <input type="text" class="form-control" id="status" aria-describedby="status" placeholder="Enter status">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">experience</label>
    <input type="number" class="form-control" id="experience" aria-describedby="experience" placeholder="Enter experience">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">comm</label>
    <input type="number" class="form-control" id="comm" aria-describedby="comm" placeholder="Enter comm">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">mgr</label>
    <input type="text" class="form-control" id="mgr" aria-describedby="mgr" placeholder="Enter mgr">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">mgrno</label>
    <input type="number" class="form-control" id="mgrno" aria-describedby="mgrno" placeholder="Enter mgrno">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">isenable</label>
    <input type="number" class="form-control" id="isenable" aria-describedby="isenable" placeholder="Enter isenable">
  </div>
  <div class="form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>